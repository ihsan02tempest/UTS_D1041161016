package com.example.uts_d1041161016;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindahAwal(View view) {
        Intent intent = new Intent(MainActivity.this, MateriActivity.class);
        startActivity(intent);

    }


    public void link(View view) {
        String url = "https://developer.android.com/reference/android/app/Service.html" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
}