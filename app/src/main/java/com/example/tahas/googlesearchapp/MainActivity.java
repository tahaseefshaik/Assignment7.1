package com.example.tahas.googlesearchapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText enterData;
    Button googleSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      // Defining the objects

        enterData =(EditText)findViewById(R.id.editText);
        googleSearch =(Button)findViewById(R.id.button);

        // Action to be performing on button

        googleSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data = enterData.getText().toString();

                // passing string and searching the data on google.com

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.google.co.in/search?q= "+data));
                startActivity(i);
            }
        });
    }
}
