/**
 * 
 */
package CSCI2010L;

import java.util.*;
import java.util.Scanner;

/**
 * @author sohel
 *
 */
public class Lab04 {
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
	int[] buffer = {4, 15, 11, 39, 40, 1};
	
	public int findMax() {	
		for(int val: buffer) {
			System.out.printf(" Element in buffer: %d\n", val);
		}
		
		return 0;
	}
	
	public int[] mySort(final int[] param) {
		int[] buffer = Arrays.copyOf(param, param.length);
		int temp = 0;
		
		for(int index1 = 0; index1 < param.length; index1++) {
			for(int index2 = index1 + 1; index2 < buffer.length; index2++) {
				if(buffer[index2] > buffer[index1]) {
					temp = buffer[index1];
					buffer[index1] = buffer[index2];
					buffer[index2] = temp;
				}
			}
		}
		
		return buffer;
	}
}
