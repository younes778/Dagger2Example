package com.example.dagger2example.dagger;

import com.example.dagger2example.model.DieselEngine;
import com.example.dagger2example.model.Engine;
import com.example.dagger2example.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine(){
        return new DieselEngine(horsePower);
    }
}
