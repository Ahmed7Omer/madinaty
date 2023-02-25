package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class Ma2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.muhamed_menu, menu);
        return true;
    }
    public void buttom(View view) {

        Intent intent;
        intent = new Intent(Ma2.this, Ma4.class);
        startActivity(intent);
    }
    public void buttom2(View view) {
        Intent intent;
        intent = new Intent(Ma2.this, Ma5.class);
        startActivity(intent);
    }
    public void buttom3(View view) {
        Intent intent;
        intent = new Intent(Ma2.this, Ma5.class);
        startActivity(intent);
    }
    public void buttom4(View view) {
        Intent intent;
        intent = new Intent(Ma2.this, Ma3.class);
        startActivity(intent);
    }



}