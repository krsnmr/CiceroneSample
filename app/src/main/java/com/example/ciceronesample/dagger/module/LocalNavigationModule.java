package com.example.ciceronesample.dagger.module;

import com.example.ciceronesample.subnavigation.LocalCiceroneHolder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LocalNavigationModule {

	@Provides
	@Singleton
	LocalCiceroneHolder provideLocalNavigationHolder() {
		return new LocalCiceroneHolder();
	}
}