package com.dagger.example;

import com.dagger.example.dagger.component.DaggerAppTwoComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class DaggerExampleTwoApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppTwoComponent.builder().create(this);
    }
}
