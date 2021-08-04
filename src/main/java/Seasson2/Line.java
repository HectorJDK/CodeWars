package Seasson2;

/*
 * Sheldon, Leonard, Penny, Rajesh and Howard are in the queue for a "Double Cola" drink vending machine; 
 * there are no other people in the queue. The first one in the queue (Sheldon) buys a can, drinks it and doubles! 
 * The resulting two Sheldons go to the end of the queue. Then the next in the queue (Leonard) buys a can, 
 * drinks it and gets to the end of the queue as two Leonards, and so on.
 * 
 * For example, Penny drinks the third can of cola and the queue will look like this:
 * Rajesh, Howard, Sheldon, Sheldon, Leonard, Leonard, Penny, Penny
 * Write a program that will return the name of the person who will drink the n-th cola.
 */
public class Line {
    public static String WhoIsNext(String[] names, int n) {
	// No es necesario el calculo
	if (n < names.length)
	    return names[n - 1];

	while (n >= names.length) {
	    int position = n - names.length;
	    n = (int) Math.floor(position / 2);
	}
	return names[n];
    }

}
