package com.epam.array.reseter;

import java.util.Arrays;

import com.epam.array.reseter.converter.Converter;

/**
 * Class of Launching the program
 */
public class Reseter {
	
	/*Array*/
	private final static int[] ARRAY_INT = {-50, 0, 3, 1, -8, 10, 25};
	/*Bottom border*/
	private final static int BOTTOM_BORDER = 1;
	/*Top border*/
	private final static int TOP_BORDER = 12;
	
	/**
	 * Launch program
	  @param main args
	 */	
    public static void main(String[] args) {
    	Reseter reseter = new Reseter();
    	reseter.convert(ARRAY_INT, BOTTOM_BORDER, TOP_BORDER);
    }
    
	/**
	 * Covert array
	  @param array array
	  @param lowLimit bottom line
	  @param hiLimit upper bound
	 */	
    public void convert(int[] array, int lowLimit, int hiLimit) {
    	showInputArray(array, lowLimit, hiLimit);
    	int[] resultArray = convertArray(array, lowLimit, hiLimit);
    	showOutputArray(resultArray);
    }
    
	/**
	 * Input array
	  @param array array
	  @param lowLimit bottom line
	  @param hiLimit upper bound
	 */	
    public void showInputArray(int[] array, int lowLimit, int hiLimit) {
    	System.out.println("Array: " + Arrays.toString(array) + "   bottomBorder: " + lowLimit + "   topBorder: " + hiLimit);
    }
    
	/**
	 * Convert array
	  @param array array
	  @param lowLimit bottom line
	  @param hiLimit upper bound
	  @return array
	 */	
    public int[] convertArray(int[] array, int lowLimit, int hiLimit) {
    	Converter converter = new Converter();
    	return converter.convertArray(array, lowLimit, hiLimit);
    }
    
	/**
	 * Output array
	  @param array array
	 */	
    public void showOutputArray(int[] array) {
    	System.out.println("Array: " + Arrays.toString(array));
    } 
}
