package com.example.findinbangalore.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.findinbangalore.R;
import com.example.findinbangalore.model.ResultItem;

public class ResultListAdapter extends BaseAdapter {

	Context context;
	ArrayList<ResultItem> resultList;

	public ResultListAdapter(Context context,
			ArrayList<ResultItem> resultList) {
		this.context = context;
		this.resultList = resultList;
	}

	@Override
	public int getCount() {
		return resultList.size();
	}

	@Override
	public Object getItem(int position) {
		return resultList.get(position);
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
			convertView = inflater.inflate(R.layout.result_list_item, null);
		}

		ImageView ivResultIcon = (ImageView) convertView
				.findViewById(R.id.ivResultIcon);
		TextView tvResultName = (TextView) convertView
				.findViewById(R.id.tvResultName);

		ivResultIcon.setImageResource(resultList.get(position).getresultIcon());
		tvResultName.setText(resultList.get(position).getresultName());

		return convertView;
	}

}
