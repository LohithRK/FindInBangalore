package com.example.findinbangalore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AreaSelectActivity extends Activity {

	CharSequence appTitle;

	String[] areaNames;

	ListView lvAreas;
	
	ArrayAdapter<String> areaAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_area_select);

		Intent intent = getIntent();
		appTitle = intent.getCharSequenceExtra("selectedCategory");
		getActionBar().setTitle(appTitle);

		areaNames = getResources().getStringArray(R.array.area_names);

		lvAreas = (ListView) findViewById(R.id.lvAreas);
		
		areaAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, areaNames);
		
		lvAreas.setAdapter(areaAdapter);
		
		lvAreas.setOnItemClickListener(new ListView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent = new Intent(getBaseContext(), ResultsActivity.class);
				lvAreas.setSelected(true);
				startActivity(intent);
			}
		});	
	}

}
