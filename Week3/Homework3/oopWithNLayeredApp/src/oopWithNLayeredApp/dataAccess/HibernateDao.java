package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entity.Category;
import oopWithNLayeredApp.entity.Course;
import oopWithNLayeredApp.entity.Educator;

public class HibernateDao implements CategoryDao, CourseDao, EducatorDao {

	@Override
	public void add(Educator educator) {
		System.out.println("Educator added with Hibernate : " + educator.getName() + educator.getLastName());

	}

	@Override
	public void add(Course course) {
		System.out.println("Course data added with Hibernate : " + course.getName());

	}

	@Override
	public void add(Category category) {
		System.out.println("Category data added with Hibernate : " + category.getName());

	}

}
