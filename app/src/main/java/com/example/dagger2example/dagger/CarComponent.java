package com.example.dagger2example.dagger;

import com.example.dagger2example.activities.MainActivity;
import com.example.dagger2example.model.Car;
import com.example.dagger2example.model.PetrolEngine;
import com.example.dagger2example.model.Wheels;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component  (modules = {WheelModule.class, DieselEngineModule.class})
public interface CarComponent {
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        CarComponent build();
    }
}
