package com.example.dagger2example.dagger;

import com.example.dagger2example.activities.MainActivity;
import com.example.dagger2example.model.Car;

import dagger.Component;

@Component
public interface CarComponent {
    void inject(MainActivity mainActivity);
}
