package com.example.findinbangalore.model;

public class CategoryItem {

	String categoryName;
	int categoryIcon;

	public CategoryItem(String n, int i) {
		categoryName = n;
		categoryIcon = i;
	}

	public String getcategoryName() {
		return categoryName;
	}

	public void setcategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getcategoryIcon() {
		return categoryIcon;
	}

	public void setcategoryIcon(int categoryIcon) {
		this.categoryIcon = categoryIcon;
	}

}
