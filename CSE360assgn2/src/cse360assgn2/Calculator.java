/**	Rida Shiban
 *	ASU ID: 1212541783
 *	CSE 360 Assgn 2
 *	Description: Scientific calculator
 */

package cse360assgn2;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0; // not needed - included for clarity
		
	}
	
	/**
	 * @return returns the running total stored in the calculator
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Takes an integer and adds it to the calculator's total
	 * @param value is user input
	 */
	public void add (int value) {
		total = total + value;
	}

	/**
	 * Takes an integer and subtracts it from the calculator's total
	 * @param value is user input
	 */
	public void subtract (int value) {
		total = total - value;
	}

	/**
	 * Takes an integer and multiplies it by the calculator's total
	 * @param value is user input
	 */
	public void multiply (int value) {
		total = total * value;
	}

	/**
	 * Takes an integer and divides it by the calculator's total
	 * @param value is user input, if input is 0, the method returns
	 *  	  0 and does not divide
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	public String getHistory () {
		return "";
	}
}