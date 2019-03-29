package com.example.dagger2example.dagger;

import com.example.dagger2example.model.Car;

import dagger.Component;

@Component
public interface CarComponent {
    public Car getCar();
}
