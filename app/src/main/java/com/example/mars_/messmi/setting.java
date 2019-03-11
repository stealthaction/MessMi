package com.example.mars_.messmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }
    public void Onclickbutton3(View view)
    {
        Intent intent = new Intent(this, vhod.class);
        startActivity(intent);
    }
}
