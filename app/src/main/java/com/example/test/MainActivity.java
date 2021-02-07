package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.next_btn);
        btn.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent( MainActivity.this,MainActivity2.class);
        String message;
        message="this is new";
        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);
    }
}