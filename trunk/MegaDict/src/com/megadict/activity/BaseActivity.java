package com.megadict.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.megadict.R;

public abstract class BaseActivity extends Activity {
	private final int layoutID;
	public BaseActivity(final int layoutID) {
		super();
		this.layoutID = layoutID;
	}

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(layoutID);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.window_title);

	}
}
