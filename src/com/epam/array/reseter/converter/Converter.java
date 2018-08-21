package com.epam.array.reseter.converter;

import java.util.Arrays;

/**
 * Class of zeroing array
 */
public class Converter {

	/**
	 * Convert array
	  @param array array
	  @param lowLimit bottom line
	  @param hiLimit upper bound
	  @return array
	 */	
    public int[] convertArray(int[] array, int lowLimit, int hiLimit) {
    	
        int amount = 0;
        int avg = 0;
        
        int[] dimArray = Arrays.copyOf(array, array.length);
        
        for (int i = 0; i < dimArray.length; i++) {
        	int item = dimArray[i];
        	if ((item >= lowLimit) && (item <= hiLimit)) {
        		amount++;
        		avg += item;
        	}
        }
        
        avg = avg / amount;

        if (isConditionComparison(avg, amount)) {
        	dimArray = zeroing(dimArray);
        }
        return dimArray;
    }

	/**
	 * Comparison sum and amount
	  @param lowLimit bottom line
	  @param hiLimit upper bound
	  @return condition
	 */	
    private boolean isConditionComparison(int sum, int amount) {
    	return (amount != 0) && (sum > amount);
    }
    
	/**
	 * Assigning zero
	  @param array array
	  @return array
	 */	
    private int[] zeroing(int[] array) {
    	int[] dimArray = Arrays.copyOf(array, array.length);	
    	for (int i = 0; i < dimArray.length; i++) {
    		if (dimArray[i] > 0) {
    			dimArray[i] = 0;
    		}
    	}
    	return dimArray;
    }
}
