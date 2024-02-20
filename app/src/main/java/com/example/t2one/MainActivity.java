package com.example.t2one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String KEY = "key";
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString(KEY,this.getString(R.string.strsdk));
        super.onSaveInstanceState(savedInstanceState);
        Log.d("RRR","onSaveInstanceState()");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String sdk;
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null)
        {
            sdk = savedInstanceState.getString(KEY);

        }
        else {
            sdk = this.getString(R.string.strsdk);
        }
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            TextView t1 = findViewById(R.id.textView);
            t1.setText(Build.VERSION.SDK_INT + ": " + sdk + "");
        }
        Log.d("RRR","onCreate()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRR","onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRR","onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRR","onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRR","onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.os.Debug.stopMethodTracing();
        Log.d("RRR","onDestroy()");
    }
}