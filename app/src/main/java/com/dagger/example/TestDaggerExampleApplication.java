package com.dagger.example;


import com.dagger.example.dagger.component.DaggerTestAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class TestDaggerExampleApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerTestAppComponent.builder().create(this);
    }
}
