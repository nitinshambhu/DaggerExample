package com.dagger.example.dagger.component.module;

import com.dagger.example.dagger.scope.ActivityScope;
import com.dagger.example.data.Person;
import com.dagger.example.data.Role;

import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.mock;

@Module
public class MockEmployModule {

    @Provides
    @ActivityScope
    public Person providesPerson() {
        return mock(Person.class);
    }

    @Provides
    @ActivityScope
    public Role providesRole() {
       return mock(Role.class);
    }
}
