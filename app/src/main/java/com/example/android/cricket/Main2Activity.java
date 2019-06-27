package com.example.android.cricket;


import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;


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




