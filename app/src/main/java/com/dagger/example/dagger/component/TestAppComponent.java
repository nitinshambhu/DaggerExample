package com.dagger.example.dagger.component;


import com.dagger.example.TestDaggerExampleApplication;
import com.dagger.example.dagger.module.InjectorsModule;
import com.dagger.example.dagger.TestModule.MockModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        MockModule.class,
        InjectorsModule.class
})
public interface TestAppComponent extends AndroidInjector<TestDaggerExampleApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<TestDaggerExampleApplication> {    }
}
