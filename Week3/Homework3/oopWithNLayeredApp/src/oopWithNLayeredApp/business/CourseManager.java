package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.CourseDao;
import oopWithNLayeredApp.entity.Course;

public class CourseManager {
	private CourseDao courseDao;
	private List<Course> courses;
	private List<Logger> loggers;

	public CourseManager(CourseDao courseDao, List<Course> courses, List<Logger> loggers) {
		super();
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		try {
			isCourseExist(course.getName());
			isPriceValid(course.getPrice());
			courseDao.add(course);
			log(course);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private void log(Course course) {
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

	private void isCourseExist(String courseName) throws Exception {
		for (Course course : courses) {
			if (course.getName().equals(courseName)) {
				throw new Exception("Course exist.");
			}
		}

	}

	private void isPriceValid(double coursePrice) throws Exception {
		if (coursePrice < 0.0) {
			throw new Exception("Course price can not be less the zero.");
		}
	}
}
