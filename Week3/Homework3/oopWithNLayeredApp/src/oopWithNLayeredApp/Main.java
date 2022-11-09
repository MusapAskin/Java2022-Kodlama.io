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

		List<Logger> loggers = new ArrayList<>();
		loggers.add(new FileLogger());
		loggers.add(new DatabaseLogger());

		Course[] courses = { new Course(1, "Java", 200), new Course(1, "C#", 100) };

		CourseManager courseManager = new CourseManager(new JdbcDao(), courses, loggers);
		for (Course course : courses) {
			courseManager.add(course);
		}
		Category[] categories = { new Category(1, "Programing"), new Category(2, "All") };

		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), categories, loggers);
		for (Category category : categories) {
			categoryManager.add(category);
		}

		Educator educator = new Educator(1, "Engin", "Demirog");
		EducatorManager educatorManager = new EducatorManager(new HibernateDao(), loggers);
		educatorManager.add(educator);
	}
}
