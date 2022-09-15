package com.example.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
// import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(view -> {
            button1.setBackgroundColor(Color.GREEN);
            Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.nate.com/"));
            startActivity(mIntent);
        });

        button2.setOnClickListener(view -> {
            Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
            startActivity(mIntent);
        });

        button3.setOnClickListener(view -> {
            Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
            startActivity(mIntent);
        });
        button4.setOnClickListener(view -> finish());
    }
}