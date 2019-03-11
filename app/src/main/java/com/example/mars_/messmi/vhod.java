package com.example.mars_.messmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class vhod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vhod);
    }
    public void onMyButtonClick1(View view)
    {
        Intent intent = new Intent(this, setting.class);
        startActivity(intent);
    }
    public void onMyButtonClick2(View view)
    {
        Intent intent = new Intent(this, Mess.class);
        startActivity(intent);
    }
}
