package com.example.lbstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;

public class MainActivity extends AppCompatActivity {
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            SDKInitializer.initialize(getApplicationContext());
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
        }
        setContentView(R.layout.activity_main);
        mapView = findViewById(R.id.mapView);
    }
}