package com.kosa.myapp.board.model;

public class BoardCategory {
	private int categoryId;
	private int categoryClass1;
	private int categoryClass2;
	private String categoryName;
	private String categoryDescription;
	private int categoryOrder;
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getCategoryClass1() {
		return categoryClass1;
	}
	public void setCategoryClass1(int categoryClass1) {
		this.categoryClass1 = categoryClass1;
	}
	public int getCategoryClass2() {
		return categoryClass2;
	}
	public void setCategoryClass2(int categoryClass2) {
		this.categoryClass2 = categoryClass2;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public int getCategoryOrder() {
		return categoryOrder;
	}
	public void setCategoryOrder(int categoryOrder) {
		this.categoryOrder = categoryOrder;
	}
	@Override
	public String toString() {
		return "BoardCategory [categoryId=" + categoryId + ", categoryClass1=" + categoryClass1 + ", categoryClass2="
				+ categoryClass2 + ", categoryName=" + categoryName + ", categoryDescription=" + categoryDescription
				+ ", categoryOrder=" + categoryOrder + "]";
	}
}
