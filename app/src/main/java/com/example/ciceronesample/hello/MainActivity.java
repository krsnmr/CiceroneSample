package com.example.ciceronesample.hello;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.ciceronesample.R;
import com.example.ciceronesample.cicerone.SampleFragment;
import com.example.ciceronesample.hello.HelloWorldPresenter;
import com.example.ciceronesample.hello.HelloWorldView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.inject.Inject;

import ru.terrakok.cicerone.Navigator;
import ru.terrakok.cicerone.NavigatorHolder;
import ru.terrakok.cicerone.android.support.SupportAppNavigator;
import ru.terrakok.cicerone.commands.Command;

public class MainActivity extends MvpAppCompatActivity  implements ChainHolder ,HelloWorldView {

	private List<WeakReference<Fragment>> chain = new ArrayList<>();

	@Inject
	NavigatorHolder navigatorHolder;

	/*private Navigator navigator = new SupportAppNavigator(this, R.id.main_container) {
		@Override
		public void applyCommands(Command[] commands) {
			super.applyCommands(commands);
			getSupportFragmentManager().executePendingTransactions();
			//printScreensScheme();
		}
	};*/

	@InjectPresenter
	HelloWorldPresenter mHelloWorldPresenter;

	private TextView mHelloWorldTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		mHelloWorldTextView = ((TextView) findViewById(R.id.tvMessage));
		//mHelloWorldPresenter.
	}

	@Override
	public void showMessage(int message) {
		Log.d("MainActivity", "showMessage");
		mHelloWorldTextView.setText(message);
	}

	@Override
	public List<WeakReference<Fragment>> getChain() {
		return null;
	}



}
