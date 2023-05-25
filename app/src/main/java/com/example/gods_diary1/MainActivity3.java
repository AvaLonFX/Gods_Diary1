package com.example.gods_diary1;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonRegister;
    private TextView TextView;
    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        appDatabase = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "test-db").build();

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);
        TextView = findViewById(R.id.TextView);


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
                savetest();
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);

            }
        });
        loadtest();
    }

    private void savetest() {
        String text = editTextUsername.getText().toString();
        String text2 = editTextEmail.getText().toString();
        String text3 = editTextPassword.getText().toString();
        if (!text.isEmpty() && !text2.isEmpty() && !text3.isEmpty()) {
            test ime = new test();
            ime.username = text;
            ime.email = text2;
            ime.pass = text3;
            new InsertNoteTask().execute(ime);
            editTextUsername.setText("");
            editTextEmail.setText("");
            editTextPassword.setText("");

            loadtest();

        }

    }
    private void loadtest() {
        new LoadNotesTask().execute();
    }

    private void registerUser() {
        String username = editTextUsername.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();
        }
    }

    private class InsertNoteTask extends AsyncTask<test, Void, Void> {
        @Override
        protected Void doInBackground(test... tests) {

            appDatabase.testDao().insert(tests[0]);
            return null;
        }
    }
    private class LoadNotesTask extends AsyncTask<Void, Void,
            List<test>> {
        @Override
        protected List<test> doInBackground(Void... voids) {


            return appDatabase.testDao().getAll();
        }
        @Override
        protected void onPostExecute(List<test> notes) {
            StringBuilder stringBuilder = new StringBuilder();
            for (test note : notes) {
                String s = note.username+" " +" "+ note.email+" "+note.pass;
                stringBuilder.insert(0, "\n\n");
                stringBuilder.insert(0, s);

            }
            TextView.setText(stringBuilder.toString());
        }
    }
    }