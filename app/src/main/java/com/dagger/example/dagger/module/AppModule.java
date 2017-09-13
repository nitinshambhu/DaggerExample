package com.dagger.example.dagger.module;

import android.content.Context;

import com.dagger.example.DaggerExampleApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private DaggerExampleApplication application;

    public AppModule(DaggerExampleApplication app) {
        this.application = app;
    }

    @Provides
    @Singleton
    Context providesContext() {
        return application;
    }

    @Provides
    @Singleton
    DaggerExampleApplication providesApplication() {
        return application;
    }

}
