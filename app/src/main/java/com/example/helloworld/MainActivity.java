package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = getApplicationContext();
        CharSequence text = "Hello from Vika!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Класс создался");

        setContentView(R.layout.activity_main);

    }

    public void b_exitClick(View view) {
        System.exit(0);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Класс начал работу");
        Context context = getApplicationContext();
        CharSequence text = "Hello from onStart!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }/*
    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "Класс остановил работу");
        Context context = getApplicationContext();
        CharSequence text = "Hello from onStop!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }*/

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "Класс разрушился");
        Context context = getApplicationContext();
        CharSequence text = "Hello from onDestroy!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    protected void onPause() {
        super.onPause();
       Log.e(TAG, "Класс приостановил работу");
        Context context = getApplicationContext();
        CharSequence text = "Hello from onPause!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Класс продолжил работу");
        Context context = getApplicationContext();
        CharSequence text = "Hello from onResume!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}