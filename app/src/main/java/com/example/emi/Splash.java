package com.example.emi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
       Thread t=new Thread(){
           public void run(){
               try{
                   sleep(3000);
               }catch (Exception e){
                   e.printStackTrace();
               }finally {
                   Intent intent = new Intent(Splash.this,MainActivity.class);
                   startActivity(intent);
                   finish();
               }
           }
       };
       t.start();
    }
}