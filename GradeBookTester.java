import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook b,c;

	@BeforeEach
	void setUp() throws Exception {
		b=new GradeBook(5);
		b.addScore(1);
		b.addScore(2);
		b.addScore(3);
		b.addScore(4);
		b.addScore(0);
		c=new GradeBook(5);
		c.addScore(2);
		c.addScore(3);
		c.addScore(5);
		c.addScore(3);
		c.addScore(2);
	}

	@AfterEach
	void tearDown() throws Exception {
		b=null;
		c=null;
	}

	@Test
	void testSum() {
		assertEquals(10,b.sum());
		assertEquals(15,c.sum());
	}
	
	@Test
	void addScore() {
		assertFalse(b.addScore(0));
		assertFalse(c.addScore(0));
		assertEquals(5,b.getScoreSize());
		assertEquals(5,c.getScoreSize());
		assertTrue("1.0 2.0 3.0 4.0 0.0".equals(b.toString()));
		assertTrue("2.0 3.0 5.0 3.0 2.0".equals(c.toString()));
	}

	@Test
	void testMinimum() {
		assertEquals(0,b.minimum());
		assertEquals(2,c.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(10,b.finalScore());
		assertEquals(13,c.finalScore());
	}

}
