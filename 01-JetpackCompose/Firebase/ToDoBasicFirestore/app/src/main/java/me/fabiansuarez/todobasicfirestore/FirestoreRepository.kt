package me.fabiansuarez.todobasicfirestore

import com.google.firebase.firestore.FirebaseFirestore

class FirestoreRepository {
    private val db = FirebaseFirestore.getInstance()
    private val tasksRef = db.collection("tasks")

    fun addTask(task: Task) {
        val doc = tasksRef.document()
        val newTask = task.copy(id = doc.id)
        doc.set(newTask)
    }

    fun deleteTask(taskId: String) {
        tasksRef.document(taskId).delete()
    }

    fun updateTask(task: Task) {
        tasksRef.document(task.id).set(task)
    }

    fun getTasks(onDataChanged: (List<Task>) -> Unit) {
        tasksRef.addSnapshotListener { snapshot, _ ->
            if (snapshot != null) {
                val tasks = snapshot.toObjects(Task::class.java)
                onDataChanged(tasks)
            }
        }
    }
}