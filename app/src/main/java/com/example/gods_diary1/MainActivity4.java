package com.example.gods_diary1;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageButton1 = findViewById(R.id.imageButton1);
        ImageView imageButton2 = findViewById(R.id.imageButton2);
        ImageView imageButton3 = findViewById(R.id.imageButton3);
        ImageView imageButton4 = findViewById(R.id.imageButton4);
        ImageView imageButton5 = findViewById(R.id.imageButton5);
        ImageView imageButton6 = findViewById(R.id.imageButton6);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        if (imageButton1.isClickable()) {
            // Button is clickable
            // Perform your desired actions here
            Toast.makeText(getApplicationContext(), "Button is clickable", Toast.LENGTH_SHORT).show();
        } else {
            // Button is not clickable
            // Perform alternative actions if needed
            Toast.makeText(getApplicationContext(), "Button is not clickable", Toast.LENGTH_SHORT).show();
        }


        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Image button 2 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Image button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Image button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Image button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Image button clicked", Toast.LENGTH_SHORT).show();
            }
        });



    }
}