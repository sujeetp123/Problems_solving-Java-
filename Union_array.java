package pt;
import java.util.*;
class Union_array {
	
	public static void main(String args[]) {
	 int array1[] = {1,2,34,5,2};
	 int array2[] = {5,5,5,3,2,34,7,34,34,34,34};
	 HashSet<Integer> hs = new HashSet();
	 
	 for  ( int i =0; i< array1.length; i++) {
		 
		 
		 for ( int j=0 ;j<array2.length ;j++) {
			 
			 if (array1[i] == array2[j] ) {
				 
				 hs.add(array1[i]);
				 break;
			 }
			 
		 }
	 }
	 
	 System.out.println("====================== Common Elements of two Elements:==================");
	 for( int no : hs)
		 
	System.out.print(no + " ");
		
	 System.out.println( " ");
	 
	 
for  ( int i =0; i< array1.length; i++) {
		 hs.add(array1[i]);
		 
	 }



for  ( int j =0; j< array2.length; j++) {
		 hs.add(array2[j]);
		 
	 }
	 
	 System.out.println("====================== Union of  two array Elements:==================");
	 for( int no : hs)
		 
	System.out.print(no + " ");
	
	 
	 
	}
	
	
	
	
}