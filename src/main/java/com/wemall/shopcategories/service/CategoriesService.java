package com.wemall.shopcategories.service;



import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wemall.shopcategories.entity.Categories;
import com.wemall.shopcategories.model.CategoryModel;

public interface CategoriesService {
	List<Categories> selectAllCategories();
	
	List<CategoryModel> getCategoryModelList();
	
	Categories selectByPrimaryKey(Integer id);
	
	public List<CategoryModel> updateCategoryModelList();
	
	public void removeCategoryModelList();
	
	List<Categories> selectAllCates(int pageNow, int pageSize);
	
	PageInfo<Categories> selectCategoriesByCondition(Integer id, String name, int pageNow, int pageSize);

	int insert(Categories categories);
}
