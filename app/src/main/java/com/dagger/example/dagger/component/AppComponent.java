package com.dagger.example.dagger.component;

import com.dagger.example.DaggerExampleApplication;
import com.dagger.example.dagger.module.AppModule;
import com.dagger.example.dagger.module.MainActivityModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/*Does not inherit AndroidInjector. Injects using @subcomponent & AndroidInjector Factory.
 * MainActivitySubComponent - @subcomponent
 * MainActivityModule - Module that provides AndroidInjector Factory for a given @subcomponent*/
@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        MainActivityModule.class,
        AppModule.class
})
public abstract class AppComponent {

    public abstract void inject(DaggerExampleApplication app);
}
