/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
		toString += this.courseName + "\n";
		
                toString += ("\n Modules: ");

                for(int i = 1; i <this.modules.length; i++){
		toString += this.modules[i] + " ";
                }
                
		toString += ("\n Students: ");
                
                for(int i = 1; i <this.students.length; i++){
		toString += this.students[i] + " ";
                }

		toString += ("\n Start Date: ");
		toString += this.startDate + " ";

		toString += ("\n End Date: ");
		toString += this.endDate + " ";
		
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
