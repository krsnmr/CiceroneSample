package com.example.ciceronesample.cicerone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.example.ciceronesample.R;
import com.example.ciceronesample.SampleApplication;
import com.example.ciceronesample.mvp.StartActivityPresenter;
import com.example.ciceronesample.mvp.StartActivityView;

import javax.inject.Inject;

import ru.terrakok.cicerone.Navigator;
import ru.terrakok.cicerone.NavigatorHolder;
import ru.terrakok.cicerone.Router;
import ru.terrakok.cicerone.android.support.SupportAppNavigator;

public class StartActivity extends MvpAppCompatActivity implements StartActivityView {

	@Inject
	Router router;

	@Inject
	NavigatorHolder navigatorHolder;

	@InjectPresenter
	StartActivityPresenter presenter;

	private Navigator navigator = new SupportAppNavigator(this, -1);

	@ProvidePresenter
	public StartActivityPresenter createStartActivityPresenter() {
		return new StartActivityPresenter(router);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		SampleApplication.INSTANCE.getAppComponent().inject(this);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);

		initViews();
	}

	private void initViews() {
		findViewById(R.id.ordinary_nav_button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				presenter.onOrdinaryPressed();
			}
		});
		findViewById(R.id.multi_nav_button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				//presenter.onMultiPressed();
			}
		});
		findViewById(R.id.result_and_anim_button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				//presenter.onResultWithAnimationPressed();
			}
		});
	}

	@Override
	protected void onResume() {
		super.onResume();
		navigatorHolder.setNavigator(navigator);
	}

	@Override
	protected void onPause() {
		navigatorHolder.removeNavigator();
		super.onPause();
	}

}
