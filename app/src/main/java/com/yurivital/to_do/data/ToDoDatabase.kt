package com.yurivital.to_do.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yurivital.to_do.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1 , exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {

    abstract fun toDoDao(): ToDoDao
}