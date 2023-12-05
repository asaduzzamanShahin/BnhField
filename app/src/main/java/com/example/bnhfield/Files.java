package com.example.bnhfield;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Files extends AppCompatActivity {
private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_files);

        listView = findViewById(R.id.listviewID);

         String[] filelist=getResources().getStringArray(R.array.Files);
         ArrayAdapter<String> adapter=new ArrayAdapter<String>(Files.this, R.layout.listview_show,R.id.list_itemID,filelist);
         listView.setAdapter(adapter);

    }
}