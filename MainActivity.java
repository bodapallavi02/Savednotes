package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextNote;
    Button btnSave;
    TextView textSavedNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNote = findViewById(R.id.editTextNote);
        btnSave = findViewById(R.id.btnSave);
        textSavedNote = findViewById(R.id.textSavedNote);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String note = editTextNote.getText().toString().trim();

                if (note.isEmpty()) {

                    Toast.makeText(MainActivity.this,
                            "Please enter a note",
                            Toast.LENGTH_SHORT).show();

                } else {

                    textSavedNote.setText(note);

                    Toast.makeText(MainActivity.this,
                            "Note Saved Successfully",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}