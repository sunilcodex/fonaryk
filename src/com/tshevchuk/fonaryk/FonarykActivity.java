package com.tshevchuk.fonaryk;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public class FonarykActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a_fonaryk);

		getWindow().addFlags(
				WindowManager.LayoutParams.FLAG_FULLSCREEN
						| WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		setBrightness(100);
	}
	
	private void setBrightness(int brightness) {
	    WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
	    layoutParams.screenBrightness = brightness/100.0f;
	    getWindow().setAttributes(layoutParams);
	}
}