/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuig_ct417.ct417.parta;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	String[] exampleModule;
	Student exampleStudent;

	@Before
	public void setUp() throws Exception {
	    exampleModule = new String[]{"CT5106", "CT404", "CT417"};
	    exampleStudent = new Student("jim", 21,14041997, 15910831, "BCT", exampleModule);
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGenerateUsername() {
		assertTrue(exampleStudent.getUsername().equals("jim21"));
	}
	
	@Test
	public void testGetModule() {
		assertArrayEquals(exampleStudent.getModule(),exampleModule);
	}

}
