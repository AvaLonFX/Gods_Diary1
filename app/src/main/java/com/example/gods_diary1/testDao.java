package com.example.gods_diary1;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
@Dao
public interface testDao {
    @Insert
    void insert(test test);
    @Query("SELECT * FROM test")
    List<test> getAll();
    @Query("SELECT * FROM test WHERE username = :username")
    List<test> getUserByUsername(String username);

    @Query("SELECT * FROM test WHERE username = :username AND password = :password LIMIT 1")
    test getUserByUsernameAndPassword(String username, String password);



}
