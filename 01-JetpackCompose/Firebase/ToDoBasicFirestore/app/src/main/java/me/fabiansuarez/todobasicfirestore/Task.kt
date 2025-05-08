package me.fabiansuarez.todobasicfirestore

data class Task(
    val id: String = "",
    val title: String = "",
    val isDone: Boolean = false
)