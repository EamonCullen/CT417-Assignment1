package nuig_ct417.ct417.parta;

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
	
	public String toString() {
		String toString = ("Course: ");
		toString += this.courseName + "/n";
		
                toString += ("Modules: ");

                for(int i = 1; i <=this.modules.length; i++){
		toString += this.modules[i] + " /n";
                }
                
		toString += ("Students: ");
                
                for(int i = 1; i <=this.students.length; i++){
		toString += this.students[i] + " ";
                }

		toString += ("Start Date: ");
		toString += this.startDate + "/n";

		toString += ("End Date: ");
		toString += this.endDate + "/n";
		
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
