package emp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmpServiceTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("메소드 호출 전");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("메서드 호출 후");
	}

	@Test
	public void testGetName() {
		assertEquals("FORD", "FORD");
	}

}
