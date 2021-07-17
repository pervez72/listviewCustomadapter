package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    String[] country_name;
    int[] flags;

    private SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] flags={R.drawable.afghanistan,R.drawable.armenia,R.drawable.azerbaijan,R.drawable.bahrain,
                    R.drawable.bangladesh,R.drawable.bhutan,R.drawable.china,R.drawable.india,R.drawable.japan,
                    R.drawable.nepal,R.drawable.nepal,R.drawable.pakistan,R.drawable.srilanka


        };
            /*
        searchView=findViewById(R.id.SearchViewID);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

          */




        country_name=getResources().getStringArray(R.array.country_name);
        listView=findViewById(R.id.listViewId);

        CustomAdapter adapter=new CustomAdapter(this,country_name,flags);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value=country_name[position];
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
                

            }
        });




    }
}