package com.example.gods_diary1;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
@Dao
public interface testDao {
    @Insert
    void insert(Test test);
    @Query("SELECT * FROM Test")
    List<Test> getAll();
    @Query("SELECT * FROM Test WHERE username = :username")
    List<Test> getUserByUsername(String username);

    @Query("SELECT * FROM Test WHERE username = :username AND password = :password LIMIT 1")
    Test getUserByUsernameAndPassword(String username, String password);



}
