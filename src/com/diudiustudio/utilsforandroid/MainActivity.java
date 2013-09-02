/**
 * 
 */
package com.diudiustudio.utilsforandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * @author DiuDiu
 * 
 */
public class MainActivity extends Activity {

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void onBackwardClick(View view) {

		finish();
	}

	public void onForwardClick(View view) {
		finish();
	}

}
