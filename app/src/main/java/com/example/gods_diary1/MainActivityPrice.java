package com.example.gods_diary1;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivityPrice extends AppCompatActivity {

    private EditText editTextHeader;
    private EditText editText;
    private TextView textViewResult;
    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_price);

        editTextHeader = findViewById(R.id.editTextHeader);
        editText = findViewById(R.id.editText);
        textViewResult = findViewById(R.id.textViewResult);
        Button buttonInsert = findViewById(R.id.buttonInsert);

        appDatabase = AppDatabase.getInstance(this);

        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String headerText = editTextHeader.getText().toString().trim();
                String inputText = editText.getText().toString().trim();

                if (headerText.isEmpty() || inputText.isEmpty()) {
                    Toast.makeText(MainActivityPrice.this, "Please enter both header and text", Toast.LENGTH_SHORT).show();
                } else {
                    insertTextToDatabase(headerText, inputText);
                    editTextHeader.setText("");
                    editText.setText("");
                }
            }
        });

        displaySavedText();
    }

    private void insertTextToDatabase(String header, String text) {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                Test test = new Test();
                test.header = header;
                test.text = text;

                appDatabase.testDao().insert(test);
                displaySavedText();
            }
        });
    }

    private void displaySavedText() {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                StringBuilder stringBuilder = new StringBuilder();
                List<Test> testList = appDatabase.testDao().getAll();
                for (int i = testList.size() - 1; i >= 0; i--) {
                    Test test = testList.get(i);
                    stringBuilder.append("-----------------------------------------------------------").append("\n")
                            .append(test.header).append("\n")
                            .append(test.text).append("\n");
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textViewResult.setText(stringBuilder.toString());
                    }
                });
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
            Intent intent = new Intent(MainActivityPrice.this, MainActivity2.class);
            startActivity(intent);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
