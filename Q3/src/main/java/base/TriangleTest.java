package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	Triangle A = new Triangle(3.0, 4.0, 5.0);
	@Test
	public void testGetArea() {
		assertTrue(A.getArea() == 6.0);
	}

	@Test
	public void testGetPerimeter() {
		assertTrue(A.getPerimeter() == 12.0);
	}

}
