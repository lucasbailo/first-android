package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView rMudarAqui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rMudarAqui = findViewById(R.id.mudarAqui);

    }

    public void mudarNome(View view) {
        rMudarAqui.setText("Lucas Bailo");
    }
}