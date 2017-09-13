package com.dagger.example.dagger.module;

import com.dagger.example.dagger.scope.ActivityScope;
import com.dagger.example.data.Person;
import com.dagger.example.data.Role;

import dagger.Module;
import dagger.Provides;

@Module
public class EmployModule {

    @Provides
    @ActivityScope
    public Person providesPerson() {
        return new Person("Ayya", "baaboi");
    }

    @Provides
    @ActivityScope
    public Role providesRole() {
       return new Role("Developer", 500, 185);
    }
}
