package pt;
import java.util.*;
class Insertion_sort {
	
	
	static void sort( int arr[]) {
		
		
		for ( int i =1 ; i<arr.length-1 ;i++) {
			
			int temp =arr[i];
			int j=i-1;
			while (j >=0 && arr[j]> temp ) {
				
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=temp;
			
		}
		
		
	}
	
	
	static void Display( int arr[]) {
		int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
 
        System.out.println();
	}
	
	
	
	
	public static void main(String args[]) {
		
		int array[] = {1,2,4,8,3,6,9};
		
		Insertion_sort obj = new Insertion_sort();
		obj.sort(array);
		
		Display(array);
		
	}
}