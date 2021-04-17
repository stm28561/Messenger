package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecievedMessageActivity extends AppCompatActivity {

    private TextView recievedMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        recievedMessage = findViewById(R.id.recievedMessage);
        recievedMessage.setText(message);
    }
}