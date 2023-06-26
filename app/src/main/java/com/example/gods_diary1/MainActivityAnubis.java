package com.example.gods_diary1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivityAnubis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_anubis);

        ImageView imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Image button clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivityAnubis.this, MainActivity6.class);
                startActivity(intent);
            }
        });
    }
}