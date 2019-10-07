package com.example.finodays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button_to_recognition);
        button.setOnClickListener((v)->{
            Intent faceIntent = new Intent(this, FaceActivity.class);
            startActivity(faceIntent);
        });
    }
}
