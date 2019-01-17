package com.wemall.shopcategories.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wemall.shopcategories.entity.Categories;
import com.wemall.shopcategories.model.CategoryModel;

public class CategoriesServiceMock2 implements CategoriesService {

	public List<Categories> selectAllCategories() {
		// TODO Auto-generated method stub
		throw new RuntimeException("add user fail!");
	}

	public List<CategoryModel> getCategoryModelList() {
		// TODO Auto-generated method stub
		throw new RuntimeException("hahaha!");
	}

	public Categories selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CategoryModel> updateCategoryModelList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeCategoryModelList() {
		// TODO Auto-generated method stub
		
	}

	public List<Categories> selectAllCates(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public PageInfo<Categories> selectCategoriesByCondition(Integer id, String name, int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(Categories categories) {
		// TODO Auto-generated method stub
		return 0;
	}

 
}