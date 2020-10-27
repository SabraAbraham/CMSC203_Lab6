import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
GradeBook g1;
GradeBook g2;

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(90.0);
		g1.addScore(83.1);
		g1.addScore(62.0);
		
		g2.addScore(73.7);
		g2.addScore(89.3);
		g2.addScore(91.2);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
		
	}

	@Test
	void testAddScore() {
		
		assertTrue(g1.toString().contentEquals("90.0 83.1 62.0"));
		assertEquals(3,g1.getScoreSize(),5);
	}

	@Test
	void testSum() {
		assertEquals(235.1,g1.sum(),235.1);
	}

	@Test
	void testMinimum() {
		assertEquals(62.0,g1.minimum(),62.0);
	}

	@Test
	void testFinalScore() {
		assertEquals(173.1,g1.finalScore(),173.1);
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
