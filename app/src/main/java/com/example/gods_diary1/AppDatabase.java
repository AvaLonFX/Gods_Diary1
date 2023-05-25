package com.example.gods_diary1;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {test.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract testDao testDao();



}

