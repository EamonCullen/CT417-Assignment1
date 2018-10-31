package mainPackage;

import org.joda.time.DateTime;

public class Course {
	private String courseName;
	private String[] modules;
	private String[] students;
	private DateTime startDate;
	private DateTime endDate;

	public Course(String courseName, String[] modules, String[] students, DateTime startDate, DateTime endDate){
		this.courseName = courseName;
		this.modules = modules;
		this.students = students;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String toString(Course course) {
		String toString = ("Course: ");
		toString += course.courseName;
		
		toString = ("Modules: ");
		toString += course.modules;
		
		toString = ("Students: ");
		toString += course.students;

		toString = ("Start Date: ");
		toString += course.startDate;

		toString = ("End Date: ");
		toString += course.endDate;
		
		return toString;
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String[] getModules() {
		return modules;
	}
	public void setModules(String[] modules) {
		this.modules = modules;
	}

	public String[] getStudents() {
		return students;
	}
	public void setStudents(String[] students) {
		this.students = students;
	}

	public DateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	
	public DateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
}
