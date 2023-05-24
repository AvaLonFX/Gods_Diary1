package com.example.gods_diary1;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
@Dao
public interface testDao {
    @Insert
    void insert(test note);
    @Query("SELECT * FROM test")
    List<test> getAll();
}
