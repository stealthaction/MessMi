package com.example.mars_.messmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MessMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mess_me);
    }
    public void onMyButtonClick(View view)
    {
        Intent intent = new Intent(this, vhod.class);
        startActivity(intent);
    }
}
