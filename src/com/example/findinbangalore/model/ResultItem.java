package com.example.findinbangalore.model;

public class ResultItem {
	
	String resultName;
	int resultIcon;

	public ResultItem(String n, int i) {
		resultName = n;
		resultIcon = i;
	}

	public String getresultName() {
		return resultName;
	}

	public void setresultName(String resultName) {
		this.resultName = resultName;
	}

	public int getresultIcon() {
		return resultIcon;
	}

	public void setresultIcon(int resultIcon) {
		this.resultIcon = resultIcon;
	}

}
