package ru.pereudin.hw6.dagger.app;

import javax.inject.Singleton;

import dagger.Component;
import ru.pereudin.hw6.dagger.DaggerActivity;
import ru.pereudin.hw6.dagger.Red;
import ru.pereudin.hw6.dagger.White;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(DaggerActivity daggerActivity);

    void inject(Red red);

    void inject(White white);
}
