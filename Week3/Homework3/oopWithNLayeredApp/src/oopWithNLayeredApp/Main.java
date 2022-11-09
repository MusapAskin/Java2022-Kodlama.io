package oopWithNLayeredApp;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredApp.business.CategoryManager;
import oopWithNLayeredApp.business.CourseManager;
import oopWithNLayeredApp.business.EducatorManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateDao;
import oopWithNLayeredApp.dataAccess.JdbcDao;
import oopWithNLayeredApp.entity.Category;
import oopWithNLayeredApp.entity.Course;
import oopWithNLayeredApp.entity.Educator;

public class Main {
	public static void main(String[] args) throws Exception {
		List<Category> categories = new ArrayList<>();
		List<Course> courses = new ArrayList<>();
		List<Logger> loggers = new ArrayList<>();
		loggers.add(new FileLogger());
		loggers.add(new DatabaseLogger());

		Course course1 = new Course(1, "Java", 100);
		Course course2 = new Course(2, "C#", 200);

		CourseManager courseManager = new CourseManager(new JdbcDao(), courses, loggers);
		courseManager.add(course1);
		courseManager.add(course2);

		Category category1 = new Category(1, "Programing");
		Category category2 = new Category(2, "All");
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), categories, loggers);

		categoryManager.add(category1);
		categoryManager.add(category2);

		Educator educator = new Educator(1, "Engin", "Demirog");
		EducatorManager educatorManager = new EducatorManager(new HibernateDao(), loggers);
		educatorManager.add(educator);
	}
}
