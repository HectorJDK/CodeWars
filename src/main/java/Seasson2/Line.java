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

	int counter = 1;
	int queueLength = (counter * 2) * names.length + names.length;

	while (true) {
	    // Al encontrar que la lista simulada es mayor que 'n' se realiza las
	    // operaciones para encontrar el nombre dentro de la lista
	    if (n <= queueLength) {
		int initialPosition = queueLength - (counter * 2) * names.length;
		initialPosition = n - initialPosition;

		// Se itera por los 'grupos' para encontrar el nombre donde cada grupo tiene
		// (counter * 2) miembros
		int group = 1;
		while (group <= names.length) {
		    if (initialPosition <= group * (counter * 2))
			return names[group - 1];
		    group++;
		}
	    }
	    // Se simula el aumento de la lista dubplicando los valores en cada iteracion
	    counter = counter * 2;
	    queueLength = (counter * 2) * names.length + queueLength;
	}
    }

}
