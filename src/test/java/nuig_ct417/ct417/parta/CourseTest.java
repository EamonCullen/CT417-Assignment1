/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuig_ct417.ct417.parta;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CourseTest {
	Course exampleCourse;
	String[] exampleModules;

	@Before
	public void setUp() throws Exception {
		exampleModules = new String[]{"CT417", "CT516"};
		String[] exampleStudents = {"Jack", "Jill"};
		DateTime exampleStartDate = new DateTime(2015, 3, 26, 12, 0, 0, 0);
		DateTime exampleEndDate = new DateTime(2019, 3, 26, 12, 0, 0, 0);
		exampleCourse = new Course("BCT", exampleModules, exampleStudents, exampleStartDate, exampleEndDate);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetModules() {
		assertArrayEquals(exampleCourse.getModules(), exampleModules);
	}

}
