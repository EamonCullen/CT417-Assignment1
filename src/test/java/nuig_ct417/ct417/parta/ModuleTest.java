/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuig_ct417.ct417.parta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eamon
 */
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
