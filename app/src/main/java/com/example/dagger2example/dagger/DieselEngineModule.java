package com.example.dagger2example.dagger;

import com.example.dagger2example.model.DieselEngine;
import com.example.dagger2example.model.Engine;
import com.example.dagger2example.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
