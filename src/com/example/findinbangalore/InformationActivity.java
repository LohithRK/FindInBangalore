package com.example.findinbangalore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class InformationActivity extends Activity {
	
	CharSequence appTitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_information);
		
		Intent intent = getIntent();
		appTitle = intent.getCharSequenceExtra("selectedResult");
		getActionBar().setTitle(appTitle);
	}

}
