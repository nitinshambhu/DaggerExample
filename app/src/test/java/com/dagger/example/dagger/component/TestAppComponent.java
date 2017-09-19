package com.dagger.example.dagger.component;


import com.dagger.example.TestApplication;
import com.dagger.example.dagger.component.module.MockModule;
import com.dagger.example.dagger.component.module.TestInjectorsModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        MockModule.class,
        TestInjectorsModule.class
})
public interface TestAppComponent extends AndroidInjector<TestApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<TestApplication> {    }
}
