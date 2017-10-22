package com.example.sugandhkumar.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String string[] = {"Sugandh","Superiya","Shivangi","Soniya","Aparna","divyanshu","marcelo"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter <String> arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_selectable_list_item,string);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

               @Override

            public void OnItemClickListener(AdapterView<?> parent,View view, int position, Long id) {
                Toast.makeText(MainActivity.this, string[position], Toast.LENGTH_SHORT).show();
            }
        }
    }};