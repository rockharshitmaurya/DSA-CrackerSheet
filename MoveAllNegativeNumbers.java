/*package whatever //do not write package name here */

import java.io.*;

class MoveAllNegativeNumbers {
	public static void main (String[] args) {
		int[] arr={-2,3,4,5,-2,23,-3};
	int len=arr.length;
	int j = 0, temp;
		for (int i = 0; i < len; i++) {
			if (arr[i] < 0) {
				if (i != j) {
			//	System.out.println("if ("+i+" != "+j+")");
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		for (int i = 0; i < len; i++) {
		    System.out.println(arr[i]);
		
	}
	}
}
