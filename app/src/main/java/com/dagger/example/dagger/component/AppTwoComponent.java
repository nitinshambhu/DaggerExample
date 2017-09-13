package com.dagger.example.dagger.component;


import com.dagger.example.DaggerExampleTwoApplication;
import com.dagger.example.dagger.module.InjectorsModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
/*Injects by inheriting AndroidInjector & Injectors module */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        InjectorsModule.class
})
public interface AppTwoComponent extends AndroidInjector<DaggerExampleTwoApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<DaggerExampleTwoApplication> {    }
}
