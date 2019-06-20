package com.example.android.cricket;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {


    RecyclerView recycler;

    //setup navigation drawer
    Toolbar toolBar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    //


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recycler = findViewById(R.id.recyclerID);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new AdapterRecyclerView(Main2Activity.this) {
        });
    }





    //5 open drawer on hamburger click
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {

            case android.R.id.home: {
                drawerLayout.openDrawer(GravityCompat.START);
                return true;//https://stackoverflow.com/questions/5719287/should-android-onoptionsitemselected-return-true-or-false#
            }
        }
        return super.onOptionsItemSelected(item);
    }


}




