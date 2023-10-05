/**
 * 
 */
package com.it1311l.uap.simplespringbootapp;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gabby
 *
 */
@RestController
public class Testing {
	
	@GetMapping("/sort")
	public int[] sortArray() {
        int[] array = {3, 10, 8, 9, 2, 2, 8, 10, 2, 3};

        // Using the Bubble Sort 
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }


	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
	}

}
