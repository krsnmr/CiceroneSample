package com.example.ciceronesample.hello;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.ciceronesample.R;

@InjectViewState
public class HelloWorldPresenter extends MvpPresenter<HelloWorldView> {
	public HelloWorldPresenter() {
		getViewState().showMessage(R.string.hello_world);
	}
}
