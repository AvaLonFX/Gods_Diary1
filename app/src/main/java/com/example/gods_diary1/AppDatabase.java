package com.example.gods_diary1;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Test.class}, version = 4)
public abstract class AppDatabase extends RoomDatabase {
    public abstract testDao testDao();
    private static AppDatabase instance;
    private static final String DATABASE_NAME = "my-database";

    public static synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, DATABASE_NAME)
                    .fallbackToDestructiveMigration() // Allow destructive migration
                    .build();
        }
        return instance;
    }
}
