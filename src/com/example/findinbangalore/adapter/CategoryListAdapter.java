package com.example.findinbangalore.adapter;

import java.util.ArrayList;

import com.example.findinbangalore.R;
import com.example.findinbangalore.model.CategoryItem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoryListAdapter extends BaseAdapter {

	Context context;
	ArrayList<CategoryItem> categoryList;

	public CategoryListAdapter(Context context,
			ArrayList<CategoryItem> categoryList) {
		this.context = context;
		this.categoryList = categoryList;
	}

	@Override
	public int getCount() {
		return categoryList.size();
	}

	@Override
	public Object getItem(int position) {
		return categoryList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.category_list_item, null);
		}

		ImageView ivCategoryIcon = (ImageView) convertView
				.findViewById(R.id.ivCategoryIcon);
		TextView tvCategoryName = (TextView) convertView
				.findViewById(R.id.tvCategoryName);

		ivCategoryIcon.setImageResource(categoryList.get(position).getcategoryIcon());
		tvCategoryName.setText(categoryList.get(position).getcategoryName());

		return convertView;
	}

}
