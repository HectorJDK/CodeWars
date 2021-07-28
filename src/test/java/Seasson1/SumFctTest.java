package Seasson1;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class SumFctTest {
    @Test
    public void testSumFct() {
	assertEquals(BigInteger.valueOf(80), SumFct.perimeter(BigInteger.valueOf(5)));
	assertEquals(BigInteger.valueOf(216), SumFct.perimeter(BigInteger.valueOf(7)));
	assertEquals(BigInteger.valueOf(14098308), SumFct.perimeter(BigInteger.valueOf(30)));
    }
}
