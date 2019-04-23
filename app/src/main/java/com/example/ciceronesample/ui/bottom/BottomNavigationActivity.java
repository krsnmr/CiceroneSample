package com.example.ciceronesample.ui.bottom;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;


import com.arellomobile.mvp.MvpAppCompatActivity;
import com.example.ciceronesample.R;
import com.example.ciceronesample.cicerone.Screens;
import com.example.ciceronesample.ui.common.RouterProvider;

import javax.inject.Inject;

import ru.terrakok.cicerone.Navigator;
import ru.terrakok.cicerone.Router;
import ru.terrakok.cicerone.commands.Back;
import ru.terrakok.cicerone.commands.Command;
import ru.terrakok.cicerone.commands.Replace;

public class BottomNavigationActivity extends MvpAppCompatActivity implements RouterProvider {

	@Inject
	Router router;




	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bottom_navigation);


	}

	@Override
	public Router getRouter() {
		return router;
	}




}
