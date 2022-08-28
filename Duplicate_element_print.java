package pt;
import java.util.*;
class Duplicate_element_print{
	
	
	public static void main(String args[]) {
		
		int arr[] = {1,2,3,3,4,5,6,4,5,6,};
	
			 for ( int i =0; i< arr.length ; i++) {
				 for ( int j =i+1 ; j < arr.length ; j++) {
					 
					 if ( arr[i] ==arr[j] && (i != j) ) {
						System.out.println(arr[i]); 
						 
					 }
				 }
			 }
		 } 
		
	
	
}