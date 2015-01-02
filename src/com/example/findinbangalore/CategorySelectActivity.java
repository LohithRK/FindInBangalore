package com.example.findinbangalore;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.findinbangalore.adapter.CategoryListAdapter;
import com.example.findinbangalore.model.CategoryItem;

public class CategorySelectActivity extends Activity {
	
	CharSequence appTitle;
	
	String[] categoryNames;
	TypedArray categoryIcons;
	
	ListView lvCategories;
	
	ArrayList<CategoryItem> categoryList;
	int i = 0;

	CategoryListAdapter categoryListAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_category_select);
		
		appTitle = "Select Category";
		getActionBar().setTitle(appTitle);
		
		categoryIcons = getResources().obtainTypedArray(R.array.category_icons);
		categoryNames = getResources().getStringArray(R.array.category_names);
		
		lvCategories = (ListView) findViewById(R.id.lvCategories);
		
		categoryList = new ArrayList<CategoryItem>();
		
		for(i = 0; i< categoryNames.length; i++) {
			categoryList.add(new CategoryItem(categoryNames[i], categoryIcons.getResourceId(i, -1)));
		}
		
		categoryIcons.recycle();
		
		categoryListAdapter = new CategoryListAdapter(getBaseContext(), categoryList);
		
		lvCategories.setAdapter(categoryListAdapter);
		
		lvCategories.setOnItemClickListener(new ListView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent = new Intent(getBaseContext(), AreaSelectActivity.class);
				intent.putExtra("selectedCategory", categoryNames[position]);
				startActivity(intent);
			}
		});
	}
}
