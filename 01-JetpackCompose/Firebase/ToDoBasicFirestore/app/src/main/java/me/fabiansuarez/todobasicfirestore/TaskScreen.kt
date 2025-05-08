package me.fabiansuarez.todobasicfirestore

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen(repository: FirestoreRepository) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Lista de tareas") },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.AccountCircle, contentDescription = "")
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {

            val taskTitle = remember { mutableStateOf("") }
            val tasks = remember { mutableStateListOf<Task>() }

            LaunchedEffect(Unit) {
                repository.getTasks { newTasks ->
                    tasks.clear()
                    tasks.addAll(newTasks)
                }
            }

            Column(modifier = Modifier.padding(16.dp)) {
                Row {
                    TextField(
                        value = taskTitle.value,
                        onValueChange = { taskTitle.value = it },
                        label = { Text("Nueva tarea") },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(onClick = {
                        if (taskTitle.value.isNotBlank()) {
                            repository.addTask(Task(title = taskTitle.value))
                            taskTitle.value = ""
                        }
                    }) {
                        Text("Agregar")
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                LazyColumn {

                    items(tasks) { task ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Checkbox(
                                    checked = task.isDone,
                                    onCheckedChange = {
                                        repository.updateTask(task.copy(isDone = it))
                                    }
                                )
                                Text(task.title)
                            }
                            IconButton(onClick = { repository.deleteTask(task.id) }) {
                                Icon(Icons.Default.Delete, contentDescription = "Eliminar")
                            }
                        }
                    }
                }
            }
        }
    }
}



