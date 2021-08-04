package Seasson2;

import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FactDecomp {
    public static String decomp(int n) {
	if (n <= 1) {
	    return "1";
	}

	List<Integer> primeList = primeNumbersTill(n);
	Hashtable<Integer, Integer> result = new Hashtable<>();
	int numberToDecompose = n;

	// Hacemos descomposicion de un numero
	while (true) {
	    for (Integer prime : primeList) {
		if (numberToDecompose % prime == 0) {
		    addToHash(result, prime);
		    numberToDecompose = numberToDecompose / prime;
		    if (isPrime(numberToDecompose)) {
			addToHash(result, numberToDecompose);
			return "";
		    }
		    break;
		}
	    }
	}
    }

    public static List<Integer> primeNumbersTill(int n) {
	return IntStream.rangeClosed(2, n).filter(x -> isPrime(x)).boxed().collect(Collectors.toList());
    }

    private static boolean isPrime(int number) {
	return IntStream.rangeClosed(2, (int) (Math.sqrt(number))).allMatch(n -> number % n != 0);
    }

    private static void addToHash(Hashtable<Integer, Integer> r, int n) {
	if (r.get(n) == null) {
	    r.put(n, 1);
	} else {
	    r.put(n, r.get(n) + 1);
	}

	// r.put(n, (r.get(n) == null) ? r.put(n, 1) : r.put(n, r.get(n) + 1));
    }

    private static String formatResult(Hashtable<Integer, Integer> result) {
	StringBuilder format = new StringBuilder();

	return "";
    }
}
