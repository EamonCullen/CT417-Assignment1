package mainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ModuleTest {
	String[] exampleStudentArray;
	String[] exampleCourseArray;
	Module exampleModule;

	@Before
	public void setUp() throws Exception {
		exampleStudentArray = new String[]{"Jack", "Jill"};
		exampleCourseArray = new String[]{"BCT", "BEC"};
		exampleModule = new Module("Software Engineering", "CT417", exampleStudentArray, exampleCourseArray);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStudentArray() {
		assertArrayEquals(exampleModule.getStudents(), exampleStudentArray);
	}

	@Test
	public void testCourseArray() {
		assertArrayEquals(exampleModule.getCourses(), exampleCourseArray);
	}
}
