package com.example.ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnReinitialiser, btnAfficher, btnQuitter;
    EditText nbrInsert;
    TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReinitialiser = findViewById(R.id.btnReinitialiser);
        btnQuitter = findViewById(R.id.btnQuitter);
        nbrInsert = findViewById(R.id.nbrInsert);
        result = findViewById(R.id.result);

        btnReinitialiser.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                nbrInsert.setText("");
                StringBuilder r = new StringBuilder();
                for (int i = 0; i <= 10 ; i++) {
                    r.append(String.format("? x %d = ?\n", i));
                }
                result.setText(r.toString());
            }
        });

        btnQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}