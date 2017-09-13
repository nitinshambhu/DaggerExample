package com.dagger.example.dagger.component;

import com.dagger.example.dagger.module.EmployModule;
import com.dagger.example.dagger.scope.ActivityScope;
import com.dagger.example.view.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ActivityScope
@Subcomponent(modules = EmployModule.class)
public interface MainActivitySubComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
