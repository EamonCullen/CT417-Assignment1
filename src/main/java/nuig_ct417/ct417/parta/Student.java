package nuig_ct417.ct417.parta;

public class Student {
        private String name;
        private int age;
        private int dob;
        private int id;
        private String course;
        private String[] module;
        private String username = generateUsername();
        
    public Student(String name, int age, int dob, int id, String course, String[] module) {
    	this.name = name;
    	this.age = age;
    	this.dob = dob;
    	this.id = id;
    	this.course = course;
    	this.module = module;
    	username = generateUsername();
}    

	public String toString() {
		String toString = ("Student: ");
		toString += this.name;
		
		toString += ("\n Age: ");
		toString += this.age;
		
		toString += ("\n DoB: ");
		toString += this.dob;

		toString += ("\n ID: ");
		toString += this.id;
		
		toString += ("\n Course: ");
		toString += this.course;
		
		toString += ("\n Modules: ");
                for(int i = 1; i<this.module.length; i++){
		toString += this.module[i] + " ";
                }
		return toString;
	}
    
	private String generateUsername(){
        String ageString = Integer.toString(age);
        return name += ageString;
    }
	public String getUsername(){
		return username;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String[] getModule() {
		return module;
	}
	public void setModule(String[] module) {
		this.module = module;
	}
}
