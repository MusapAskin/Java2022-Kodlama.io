package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entity.Category;
import oopWithNLayeredApp.entity.Course;
import oopWithNLayeredApp.entity.Educator;

public class JdbcDao implements EducatorDao, CategoryDao, CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Data added with Jdbc : " + course.getName());

	}

	@Override
	public void add(Category category) {
		System.out.println("Data added with Jdbc : " + category.getName());

	}

	@Override
	public void add(Educator educator) {
		System.out.println("Data added with Jdbc : " + educator.getName() + educator.getLastName());

	}

}
