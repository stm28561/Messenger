package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessage extends AppCompatActivity {

    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        editTextMessage = findViewById(R.id.editTextMessage);
    }

    public void onClickSendMessage(View view) {
        String message = editTextMessage.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        Intent chooseIntent = Intent.createChooser(intent, getString(R.string.chooseTitle));
        startActivity(chooseIntent);
    }
}