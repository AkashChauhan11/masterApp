package com.akash.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void whatsapp_click(View view){
        Intent i=new Intent(getApplicationContext(),whatsappActivity.class);
        startActivity(i);
    }
   public void email_click(View view){
        Intent i=new Intent(getApplicationContext(),emailActivity.class);
        startActivity(i);

   }
    public void sms_click(View view){
        Intent i=new Intent(getApplicationContext(),whatsappActivity.class);
        startActivity(i);

    }
   public void wallpaper_click(View view){
        Intent i=new Intent(getApplicationContext(),whatsappActivity.class);
        startActivity(i);
    }
}