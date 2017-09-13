package com.dagger.example.dagger.module;

import android.app.Application;

import com.dagger.example.DaggerExampleTwoApplication;
import com.dagger.example.dagger.scope.ActivityScope;
import com.dagger.example.view.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class InjectorsModule {

    @Binds
    abstract Application application(DaggerExampleTwoApplication application);

    @ActivityScope
    @ContributesAndroidInjector(modules = EmployModule.class)
    abstract MainActivity mainActivity();
}
