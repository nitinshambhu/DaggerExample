package com.dagger.example.dagger.component.module;

import com.dagger.example.presenter.MainPresenter;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

// Override all the class objects with their mocks.

@Module
public class MockModule {

    @Provides
    @Singleton
    public MainPresenter providesMainPresenter() {
        return Mockito.mock(MainPresenter.class);
    }

}
