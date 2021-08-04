package Seasson2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LineTest {
    @Test
    public void test1() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 1;
	assertEquals("Sheldon", new Line().WhoIsNext(names, n));
    }

    @Test
    public void test2() {
	String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
	int n = 1802;
	assertEquals("Penny", new Line().WhoIsNext(names, n));
    }
}