package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNDv2AndCallsRun() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(30, 30, 30);
	    String string0 = nDv2_0.run(12, 30, 1956);
	    assertEquals("12/31/1956", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv216() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(29, 29, 29);
	    String string0 = nDv2_0.run(29, 29, 29);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv217() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(11, 11, 11);
	    String string0 = nDv2_0.run(11, 11, 11);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv214() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(2238, 11, 1);
	    String string0 = nDv2_0.run(11, 1588, 2238);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv215() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(11, 11, 11);
	    String string0 = nDv2_0.run(3, 11, 2021);
	    assertEquals("3/12/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv212() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(11, 11, 11);
	    String string0 = nDv2_0.run(11, 3, 1809);
	    assertEquals("11/4/1809", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv213() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(11, 11, 11);
	    String string0 = nDv2_0.run(11, 2012, 2012);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(30, 30, 30);
	    String string0 = nDv2_0.run(12, 30, 1956);
	    assertEquals("12/31/1956", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv210() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(30, 30, 30);
	    String string0 = nDv2_0.run(6, 30, 1925);
	    assertEquals("7/1/1925", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv211() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(31, 31, 31);
	    String string0 = nDv2_0.run(10, 31, 2012);
	    assertEquals("11/1/2012", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive1() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(11, 11, 11);
	    String string0 = nDv2_0.run(96, (-3122), 11);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv29() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(6, 6, 6);
	    String string0 = nDv2_0.run(6, 31, 1916);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive0() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(11, 11, 11);
	    String string0 = nDv2_0.run((-1961), 14, 2021);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv27() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(31, 31, 31);
	    String string0 = nDv2_0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv28() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(2, 2, 2);
	    String string0 = nDv2_0.run(2, 2, 1806);
	    assertEquals("2/3/1806", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv25() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(30, 30, 30);
	    String string0 = nDv2_0.run(2, 30, 2012);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(11, 11, 11);
	    String string0 = nDv2_0.run(9, 11, 1835);
	    assertEquals("9/12/1835", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv26() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(31, 31, 31);
	    String string0 = nDv2_0.run(12, 31, 2012);
	    assertEquals("1/1/2013", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv23() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(28, 28, 28);
	    String string0 = nDv2_0.run(5, 28, 2021);
	    assertEquals("5/29/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv24() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(1, 1, 1);
	    String string0 = nDv2_0.run(1, 1, 1806);
	    assertEquals("1/2/1806", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv21() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(11, (-3662), 17);
	    String string0 = nDv2_0.run(8, 1, 2021);
	    assertEquals("8/2/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv22() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(29, 29, 29);
	    String string0 = nDv2_0.run(7, 10, 1801);
	    assertEquals("7/11/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv20() throws Throwable {
	    NDv2 nDv2_0 = new NDv2(11, 11, 11);
	    String string0 = nDv2_0.run(4, 11, 2021);
	    assertEquals("4/12/2021", string0);
	}

}