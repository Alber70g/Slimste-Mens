package tools;

import java.util.Random;

public abstract class Tools {
	
	/**
	 * Software version
	 */
	public static String Version = "0.1";
	
	/**
	 * Random
	 */
	private static Random rand = new Random();
	
	/**
	 * Generates a random number between the given range
	 * Needs max to be greater than min, else return min
	 * @param min {integer} The lowest number in the range
	 * @param max {integer} The largest number in the range
	 * @return A random number between the given range
	 */
	public static int getRandomNumber(int min, int max) {
		// Add 1, because otherwise the largest number (max) 
		// would not be included in the random number.
		if(max < min) return min;
		return rand.nextInt((max - min) + 1) + min;
	}
}