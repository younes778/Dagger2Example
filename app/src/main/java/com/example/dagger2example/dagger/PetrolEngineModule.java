package com.example.dagger2example.dagger;

import com.example.dagger2example.model.Engine;
import com.example.dagger2example.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
