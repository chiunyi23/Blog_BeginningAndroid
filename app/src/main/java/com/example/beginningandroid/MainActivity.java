package com.example.beginningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String tag = "Lifecycle Step";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "In the onCreate() event");
    }

    public void onStart() {
        super.onStart();
        Log.d(tag, "In the OnStart() event");
    }

    public void onRestart() {
        super.onRestart();
        Log.d(tag, "In the on Restart() event");
    }

    public void onPause() {
        super.onPause();
        Log.d(tag, "In the on onPause() event");
    }

    public void onStop() {
        super.onStop();
        Log.d(tag, "In the on onStop() event");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "In the on onDestroy() event");
    }
}