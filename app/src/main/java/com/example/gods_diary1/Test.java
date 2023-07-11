package com.example.gods_diary1;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class Test {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name = "Username")
    public String username;
    @ColumnInfo(name = "E-mail")
    public String email;
    @ColumnInfo(name = "Password")
    public String pass;

    @ColumnInfo(name = "header")
    public String header;
    @ColumnInfo(name = "text")
    public String text;
}



