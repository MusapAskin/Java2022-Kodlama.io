package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.CategoryDao;
import oopWithNLayeredApp.entity.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Category[] categories;
	private List<Logger> loggers;

	public CategoryManager(CategoryDao categoryDao, Category[] categories, List<Logger> loggers) {
		super();
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		try {
			/*
			 * Burada hata her türlü yakalanacaktır.Çünkü veri doğrulaması databaseden değil
			 * diziden yapılmaktadır. Dolayısıyla dizi ilk başta tanımlandığından
			 * eklediğimiz eleman zaten dizide var.
			 */
			isCategoryExist(category.getName());
			categoryDao.add(category);
			log(category);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void log(Category category) {
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}

	private void isCategoryExist(String categoryName) throws Exception {
		for (Category category : categories) {
			if (category.getName().equals(categoryName)) {
				throw new Exception("Category exist.");
			}
		}
	}
}
