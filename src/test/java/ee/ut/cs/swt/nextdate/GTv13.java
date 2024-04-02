package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv13 {

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(2893, 2893, (-2160));
	    String string0 = nextDate0.run((-1842), 2, 2893);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive9() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 4, 4);
	    String string0 = nextDate0.run(4, 30, 1808);
	    assertEquals("5/1/1808", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive8() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 31, 31);
	    String string0 = nextDate0.run(2, 31, 1808);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(0, 0, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 1, 1801);
	    assertEquals("12/2/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive10() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 4, 4);
	    String string0 = nextDate0.run(4, 31, 1808);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive13() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 1909);
	    assertEquals("3/4/1909", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive14() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 4, 4);
	    String string0 = nextDate0.run(3, 1481, 1820);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive11() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(6, 11, 2021);
	    assertEquals("6/12/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive12() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 5, 5);
	    String string0 = nextDate0.run(5, 31, 1812);
	    assertEquals("6/1/1812", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive15() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 3, 3);
	    String string0 = nextDate0.run(11, 10, 2307);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive16() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 12, 31);
	    String string0 = nextDate0.run(12, 31, 1857);
	    assertEquals("1/1/1858", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 10, 10);
	    String string0 = nextDate0.run(10, 12, 1836);
	    assertEquals("10/13/1836", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 1, 1801);
	    assertEquals("12/2/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive3() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 9, 9);
	    String string0 = nextDate0.run(9, 30, 1836);
	    assertEquals("10/1/1836", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 11, 1818);
	    assertEquals("11/12/1818", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive5() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 1842);
	    assertEquals("7/8/1842", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive4() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(8, 8, 1848);
	    assertEquals("8/9/1848", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive7() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 1801);
	    assertEquals("2/3/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive6() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1815);
	    assertEquals("1/2/1815", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative1() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(2789, 10, (-288));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative0() throws Throwable {
	    NextDate nextDate0 = new NextDate(2893, 2893, (-2160));
	    String string0 = nextDate0.run(1, 582, (-1));
	    assertEquals("invalid Input Date", string0);
	}

}