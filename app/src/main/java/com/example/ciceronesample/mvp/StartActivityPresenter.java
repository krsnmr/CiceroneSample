package com.example.ciceronesample.mvp;

import ru.terrakok.cicerone.Router;
import com.arellomobile.mvp.MvpPresenter;
import com.example.ciceronesample.cicerone.Screens;

public class StartActivityPresenter extends MvpPresenter<StartActivityView> {
	private Router router;

	public StartActivityPresenter(Router router) {
		this.router = router;
	}

	public void onOrdinaryPressed() {
		router.navigateTo(new Screens.MainScreen());
	}

	public void onMultiPressed() {
		router.navigateTo(new Screens.BottomNavigationScreen());
	}
/*
	public void onResultWithAnimationPressed() {
		router.navigateTo(new Screens.ProfileScreen());
	}*/

	public void onBackPressed() {
		router.exit();
	}
}