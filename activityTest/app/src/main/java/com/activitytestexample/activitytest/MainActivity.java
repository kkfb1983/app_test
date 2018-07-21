package com.activitytestexample.activitytest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
//        Log.d("create","test log.");
        Button btn1 = (Button) findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Toast.makeText(MainActivity.this,"我的弹出窗口",Toast.LENGTH_SHORT).show();
//                finish();
//                Intent intent = new Intent(MainActivity.this,SecoundActivity.class);
                Intent intent = new Intent("com.activitytestexample.activitytest.ACTION_START");
                intent.addCategory("com.activitytestexample.activitytest.MY_CATEGORY");
                startActivity(intent);
            }

        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_1:
                Toast.makeText(this,"click menu 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_2:
                Toast.makeText(this,"click menu 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_secound:
                Intent intent = new Intent(MainActivity.this,SecoundActivity.class);
                startActivity(intent);
                break;
                default:
        }
        return true;
    }

}
