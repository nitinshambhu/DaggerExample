package com.dagger.example.dagger.component.module;


import android.app.Activity;

import com.dagger.example.dagger.subcomponent.MainActivitySubComponent;
import com.dagger.example.view.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainActivitySubComponent.class)
public abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityInjectorFactory(MainActivitySubComponent.Builder builder);
}
