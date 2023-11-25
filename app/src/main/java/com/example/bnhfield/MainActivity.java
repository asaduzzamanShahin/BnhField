package com.example.bnhfield;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
DrawerLayout drawerLayout;
NavigationView navigationView;
ActionBarDrawerToggle drawerToggle;


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem  item){
    if (drawerToggle.onOptionsItemSelected(item)){
        return true;

    }
return super.onOptionsItemSelected(item);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//navigation drawer code here

        drawerLayout= findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.navView);
        drawerToggle= new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               switch (item.getItemId())
               {
                   case R.id.state:
                   {
                       Toast.makeText(MainActivity.this, "Home Selector",Toast.LENGTH_SHORT).show();break;
                   }

                   case R.id.gallery:
                   {
                       Toast.makeText(MainActivity.this, "Gallery Selector",Toast.LENGTH_SHORT).show();break;
                   }

                   case R.id.draft:
                   {
                       Toast.makeText(MainActivity.this, "Draft Selector",Toast.LENGTH_SHORT).show();break;
                   }

                   case R.id.file:
                   {
                       Toast.makeText(MainActivity.this, "Files Selector",Toast.LENGTH_SHORT).show();break;
                   }

                   case R.id.pdf:
                   {
                       Toast.makeText(MainActivity.this, "PDF Selector",Toast.LENGTH_SHORT).show();break;
                   }

                   case R.id.satting:
                   {
                       Toast.makeText(MainActivity.this, "Satting Selector",Toast.LENGTH_SHORT).show();break;
                   }

                   case R.id.share:
                   {
                       Toast.makeText(MainActivity.this, "Share Selector",Toast.LENGTH_SHORT).show();break;
                   }

                   case R.id.help:
                   {
                       Toast.makeText(MainActivity.this, "Help Selector",Toast.LENGTH_SHORT).show();break;
                   }

               }

                return false;
            }
        });

    }

    /**
     *
     */
    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }

    }
}