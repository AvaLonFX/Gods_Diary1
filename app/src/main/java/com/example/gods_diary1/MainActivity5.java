package com.example.gods_diary1;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageButton1 = findViewById(R.id.imageButton1);
        ImageView imageButton2 = findViewById(R.id.imageButton2);
        ImageView imageButton3 = findViewById(R.id.imageButton3);
        ImageView imageButton4 = findViewById(R.id.imageButton4);
        ImageView imageButton5 = findViewById(R.id.imageButton5);
        ImageView imageButton6 = findViewById(R.id.imageButton6);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
                startActivity(intent);
            }
        });



        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivityFreja.class);
                startActivity(intent);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivityLoki.class);
                startActivity(intent);
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivityOdin.class);
                startActivity(intent);
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity5.this, MainActivityThor.class);
                startActivity(intent);
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivityTir.class);
                startActivity(intent);
            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menu_item2) {
            Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
            startActivity(intent);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}