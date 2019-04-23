package com.example.ciceronesample.dagger;

import com.example.ciceronesample.cicerone.StartActivity;
import com.example.ciceronesample.dagger.module.LocalNavigationModule;
import com.example.ciceronesample.dagger.module.NavigationModule;
import com.example.ciceronesample.hello.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
		NavigationModule.class,
		LocalNavigationModule.class
})
public interface AppComponent {
	void inject(StartActivity activity);

	void inject(MainActivity activity);
}
