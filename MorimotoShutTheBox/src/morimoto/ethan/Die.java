package morimoto.ethan;

import java.util.Random;

/**
 * Constructor for die
 */
public class Die {
	private int value;
	private int numSides;
	
	Die (){
		numSides = 6;
		value = roll();
	}
	
	Die(int n){
		numSides = n;
		value = roll();
	}
	
	public int roll() {
		Random rand = new Random();
		value = rand.nextInt(1, numSides+1);
		return value;
	}
	
	public void setSides(int n) {
		numSides = n;
	}
}