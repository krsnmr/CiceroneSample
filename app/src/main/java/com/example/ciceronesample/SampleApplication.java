package com.example.ciceronesample;

import android.app.Application;

import com.example.ciceronesample.dagger.AppComponent;
import com.example.ciceronesample.dagger.DaggerAppComponent;

public class SampleApplication extends Application {
	public static SampleApplication INSTANCE;
	private AppComponent appComponent;

	@Override
	public void onCreate() {
		super.onCreate();
		INSTANCE = this;
	}

	public AppComponent getAppComponent() {
		if (appComponent == null) {
			appComponent = DaggerAppComponent.builder().build();

		}
		return appComponent;
	}
}