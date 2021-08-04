package Seasson2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LineTest {
    @Test
    public void test1() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 1;
	new Line();
	assertEquals("Sheldon", Line.WhoIsNext(names, n));
    }

    @Test
    public void test2() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 6;
	new Line();
	assertEquals("Sheldon", Line.WhoIsNext(names, n));
    }

    @Test
    public void test3() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 1802;
	new Line();
	assertEquals("Penny", Line.WhoIsNext(names, n));
    }

    @Test
    public void test4() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 2;
	new Line();
	assertEquals("Leonard", Line.WhoIsNext(names, n));
    }

    @Test
    public void test6() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 10;
	new Line();
	assertEquals("Penny", Line.WhoIsNext(names, n));
    }

    @Test
    public void test7() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 534;
	new Line();
	assertEquals("Rajesh", Line.WhoIsNext(names, n));
    }

    @Test
    public void test8() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 5033;
	new Line();
	assertEquals("Howard", Line.WhoIsNext(names, n));
    }

    @Test
    public void test9() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 10010;
	new Line();
	assertEquals("Howard", Line.WhoIsNext(names, n));
    }

    @Test
    public void test10() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 63;
	new Line();
	assertEquals("Rajesh", Line.WhoIsNext(names, n));
    }

    @Test
    public void test11() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 841;
	new Line();
	assertEquals("Leonard", Line.WhoIsNext(names, n));
    }

    @Test
    public void test12() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 3667;
	new Line();
	assertEquals("Penny", Line.WhoIsNext(names, n));
    }

    @Test
    public void test13() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 38614;
	new Line();
	assertEquals("Howard", Line.WhoIsNext(names, n));
    }

    @Test
    public void test14() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 1745;
	new Line();
	assertEquals("Leonard", Line.WhoIsNext(names, n));
    }

    @Test
    public void test15() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 8302;
	new Line();
	assertEquals("Rajesh", Line.WhoIsNext(names, n));
    }

    @Test
    public void test16() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 12079;
	new Line();
	assertEquals("Sheldon", Line.WhoIsNext(names, n));
    }

    @Test
    public void test17() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 28643950;
	new Line();
	assertEquals("Leonard", Line.WhoIsNext(names, n));
    }

    @Test
    public void test18() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 159222638;
	new Line();
	assertEquals("Howard", Line.WhoIsNext(names, n));
    }

    @Test
    public void test19() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 121580142;
	new Line();
	assertEquals("Penny", Line.WhoIsNext(names, n));
    }

    @Test
    public void test20() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 1000000000;
	new Line();
	assertEquals("Penny", Line.WhoIsNext(names, n));
    }
}