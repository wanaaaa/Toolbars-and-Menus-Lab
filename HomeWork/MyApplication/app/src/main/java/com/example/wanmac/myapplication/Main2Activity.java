package com.example.wanmac.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbarLow;
        toolbarLow = (Toolbar) findViewById(R.id.toolbarLow);
        //toobarLow = (Toolbar) findViewById(R.id.toolbarLow) ;
        setSupportActionBar(toolbarLow);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        switch (item.getItemId()){
//            case R.id.iconOne:
//                //startActivity(new Intent(this, Main2Activity.class));
//                Toast.makeText(Main2Activity.this, "One clicked", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.iconTwo:
//                Toast.makeText(Main2Activity.this, "Two Clicked", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.icoThree:
//                Toast.makeText(Main2Activity.this, "Three Clicked", Toast.LENGTH_SHORT).show();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }


}
