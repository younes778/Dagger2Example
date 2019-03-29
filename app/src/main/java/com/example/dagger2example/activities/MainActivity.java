package com.example.dagger2example.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger2example.R;
import com.example.dagger2example.dagger.CarComponent;
import com.example.dagger2example.dagger.DaggerCarComponent;
import com.example.dagger2example.dagger.DieselEngineModule;
import com.example.dagger2example.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(200))
                .build();
        carComponent.inject(this);

        car.drive();
    }
}
