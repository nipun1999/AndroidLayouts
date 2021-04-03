package com.nipun.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    TextView titleTextView;
    EditText titleEditText;
    Button showTitleButton;
    Button changeTitleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleTextView = findViewById(R.id.titleText);
        titleEditText = findViewById(R.id.titleEditText);
        showTitleButton = findViewById(R.id.showTextBtn);
        changeTitleButton = findViewById(R.id.changeTextBtn);

        changeTitleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = titleEditText.getText().toString();
                Log.i("First button title",title);
                titleTextView.setText(title);
            }
        });

        showTitleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = titleEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                Bundle extras = new Bundle();
                extras.putString("text",title);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

        titleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);
            }
        });


    }
}