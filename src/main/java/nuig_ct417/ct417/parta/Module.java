
package nuig_ct417.ct417.parta;

public class Module {
    private String moduleName;
    private String moduleCode;
    private String students[];
    private String courses[];
    
	public Module(String module, String moduleCode, String students[], String courses[]) {
		this.moduleName = module;
		this.moduleCode = moduleCode;
		this.students = students;
		this.courses = courses;
	}

	public String toString() {
		String toString = ("Module: ");
		toString += this.moduleName;
		
		toString = ("Code: ");
		toString += this.moduleCode;
		
		toString = ("Students: ");
		toString += this.students;

		toString = ("Courses: ");
		toString += this.courses;
		
		return toString;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	public String getModuleCode() {
		return moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	
	public String[] getStudents() {
		return students;
	}
	public void setStudents(String[] students) {
		this.students = students;
	}
	
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
}


