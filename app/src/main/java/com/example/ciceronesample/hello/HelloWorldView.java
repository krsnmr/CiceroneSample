package com.example.ciceronesample.hello;

import com.arellomobile.mvp.MvpView;

public interface HelloWorldView extends MvpView {
	void showMessage(int message);
}
