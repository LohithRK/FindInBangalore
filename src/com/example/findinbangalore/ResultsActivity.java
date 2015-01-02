package com.example.findinbangalore;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.findinbangalore.adapter.ResultListAdapter;
import com.example.findinbangalore.model.ResultItem;

public class ResultsActivity extends Activity {
	
	CharSequence appTitle;
	
	String[] resultNames;
	TypedArray resultIcons;
	
	ListView lvResults;
	
	ArrayList<ResultItem> resultList;
	int i = 0;
	
	ResultListAdapter resultListAdapter;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);
		
		appTitle = "Search Results";
		getActionBar().setTitle(appTitle);
		
		resultIcons = getResources().obtainTypedArray(R.array.result_icons);
		resultNames = getResources().getStringArray(R.array.result_names);
		
		lvResults = (ListView) findViewById(R.id.lvResults);
		
		resultList = new ArrayList<ResultItem>();
		
		for(i = 0; i< resultNames.length; i++) {
			resultList.add(new ResultItem(resultNames[i], resultIcons.getResourceId(i, -1)));
		}
		
		resultIcons.recycle();
		
		resultListAdapter = new ResultListAdapter(getBaseContext(), resultList);
		
		lvResults.setAdapter(resultListAdapter);
		
		lvResults.setOnItemClickListener(new ListView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent = new Intent(getBaseContext(), InformationActivity.class);
				intent.putExtra("selectedResult", resultNames[position]);
				startActivity(intent);
			}
		});
		
		
		
	}

}