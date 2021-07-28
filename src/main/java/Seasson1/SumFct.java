package Seasson1;

import java.math.BigInteger;

public class SumFct {
    /*
     * The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3,
     * 5, 8. It's easy to see that the sum of the perimeters of these squares is : 4
     * * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80 Could you give the sum of the
     * perimeters of all the squares in a rectangle when there are n + 1 squares
     * disposed in the same manner as in the drawing:
     */
    public static BigInteger perimeter(BigInteger n) {
	BigInteger sum = BigInteger.ONE;
	BigInteger counter = BigInteger.ZERO;

	if (n.compareTo(BigInteger.ONE) < 0) {
	    return n.multiply(new BigInteger("4"));
	}

	BigInteger previousFib = BigInteger.ZERO;
	BigInteger currentFib = BigInteger.ONE;

	while (counter.compareTo(n) < 0) {

	    BigInteger newFib = previousFib.add(currentFib);
	    previousFib = currentFib;
	    currentFib = newFib;

	    sum = sum.add(currentFib);
	    counter = counter.add(BigInteger.ONE);
	}
	return sum.multiply(new BigInteger("4"));
    }
}
