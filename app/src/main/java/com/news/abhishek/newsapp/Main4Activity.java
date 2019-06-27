package com.news.abhishek.newsapp;

import com.example.android.cricket.R;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public String username="",country="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Spinner spinner = (Spinner) findViewById(R.id.fav1);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        country = adapterView.getItemAtPosition(i).toString();

        EditText editText=(EditText)findViewById(R.id.user1);
        username=editText.getText().toString();


        if((username.equals("")))
            Toast.makeText(getApplicationContext(),"Enter Username!",Toast.LENGTH_SHORT).show();

        else {
            Intent intent = new Intent(Main4Activity.this, Pageofoptions.class);
            intent.putExtra("String_I_need", username);
            intent.putExtra("Country_I_need", country);
            startActivity(intent);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
