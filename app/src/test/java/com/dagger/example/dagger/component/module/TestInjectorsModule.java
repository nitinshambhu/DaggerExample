package com.dagger.example.dagger.component.module;

import android.app.Application;

import com.dagger.example.TestApplication;
import com.dagger.example.dagger.scope.ActivityScope;
import com.dagger.example.view.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class TestInjectorsModule {

    @Binds
    abstract Application application(TestApplication application);

    @ActivityScope
    @ContributesAndroidInjector(modules = MockEmployModule.class)
    abstract MainActivity mainActivity();
}
