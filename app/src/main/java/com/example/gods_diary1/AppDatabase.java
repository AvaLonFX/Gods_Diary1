package com.example.gods_diary1;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Test.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract testDao testDao();



}

