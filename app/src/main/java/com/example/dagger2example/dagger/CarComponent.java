package com.example.dagger2example.dagger;

import com.example.dagger2example.activities.MainActivity;
import com.example.dagger2example.model.Car;
import com.example.dagger2example.model.PetrolEngine;
import com.example.dagger2example.model.Wheels;

import dagger.Component;

@Component  (modules = {WheelModule.class, DieselEngineModule.class})
public interface CarComponent {
    void inject(MainActivity mainActivity);
}
