package com.example.ciceronesample.cicerone;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;

import com.example.ciceronesample.hello.MainActivity;
import com.example.ciceronesample.ui.bottom.BottomNavigationActivity;

import ru.terrakok.cicerone.android.support.SupportAppScreen;


public class Screens {

	// MainActivity
	public static final class MainScreen extends SupportAppScreen {
		@Override
		public Intent getActivityIntent(Context context) {
			return new Intent(context, MainActivity.class);
		}
	}


	// github.com
	public static final class GithubScreen extends SupportAppScreen {
		@Override
		public Intent getActivityIntent(Context context) {
			return new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/terrakok/Cicerone"));
		}
	}

	public static final class SampleScreen extends SupportAppScreen {
		private final int number;

		public SampleScreen(int number) {
			this.number = number;
			this.screenKey = getClass().getSimpleName() + "_" + number;
		}

		@Override
		public Fragment getFragment() {
			//return SampleFragment.getNewInstance(number);
			return null;
		}
	}

	public static final class BottomNavigationScreen extends SupportAppScreen {
		@Override
		public Intent getActivityIntent(Context context) {
			return new Intent(context, BottomNavigationActivity.class);
		}
	}
}
