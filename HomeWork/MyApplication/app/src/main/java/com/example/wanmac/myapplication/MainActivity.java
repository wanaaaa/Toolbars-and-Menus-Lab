package com.example.wanmac.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar;
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        //toobarLow = (Toolbar) findViewById(R.id.toolbarLow) ;
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.iconOne:
                startActivity(new Intent(this, Main2Activity.class));
                Toast.makeText(MainActivity.this, "One clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.iconTwo:
                Toast.makeText(MainActivity.this, "Two Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.icoThree:
                Toast.makeText(MainActivity.this, "Three Clicked", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
