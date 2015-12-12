package com.example.cherry.login;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.cherry.login.LoginActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TEST", "oncreate1");
        setContentView(R.layout.activity_main);

    }

    public void onTestBtnClicked(View v) {
       Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
    }

}