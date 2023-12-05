package com.example.bnhfield;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AddMenu extends AppCompatActivity {
    ImageView imageView;
    Button draftButton, filesButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_menu);

        imageView=findViewById(R.id.addiconID);
        draftButton=findViewById(R.id.draftBtn);
        filesButton=findViewById(R.id.fileBtn);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddMenu.this, Home.class);
                startActivity(intent);
            }
        });
        //button onclick listener here

        draftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddMenu.this, Home.class);
                startActivity(intent);
            }
        });

        filesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddMenu.this, Files.class);
                startActivity(intent);
            }
        });
    }
}