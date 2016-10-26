package com.deliveroo.battleofimmutables;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.deliveroo.battleofimmutables.model.lombok.Driver;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Driver driver = Driver.builder()
                .id(1)
                .contactNumber("07711222333")
                .registrationNumber("XX12")
                .name("John")
                .build();

        Toast.makeText(this, driver.toString(), Toast.LENGTH_LONG).show();

        Log.d("BI", "Hello " + driver.toString());
    }
}
