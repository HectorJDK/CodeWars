package Seasson2;

import java.util.Dictionary;
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

	// Hacemos descomposicion de un numero
	for (int numberToDecompose = n; numberToDecompose > 1; numberToDecompose--) {
	    decomposeNumberInDictionary(primeList, numberToDecompose, result);
	}
	return formatResult(result, primeList);
    }

    public static void decomposeNumberInDictionary(List<Integer> primeList, int numberToDecompose,
	    Dictionary<Integer, Integer> result) {
	while (true) {
	    for (Integer prime : primeList) {
		if (numberToDecompose % prime == 0) {
		    addToDictionary(result, prime);
		    numberToDecompose = numberToDecompose / prime;
		    if (isPrime(numberToDecompose)) {
			addToDictionary(result, numberToDecompose);
			return;
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

    private static void addToDictionary(Dictionary<Integer, Integer> r, int n) {
	if (r.get(n) == null)
	    r.put(n, 1);
	else
	    r.put(n, r.get(n) + 1);
    }

    private static String formatResult(Hashtable<Integer, Integer> result, List<Integer> primeList) {
	StringBuilder format = new StringBuilder();

	for (Integer prime : primeList) {
	    if (result.containsKey(prime)) {
		format.append(prime.toString());
		if (result.get(prime) > 1) {
		    format.append("^");
		    format.append(result.get(prime).toString());
		}
		format.append(" * ");
	    }
	}

	return format.substring(0, format.length() - 3);
    }
}
