package pt;
import java.util.*;
 class SelectionSort {

	static void selection( int arr[])
	{
		for ( int i =0 ;i < arr.length-1; i++)
		{
			int min =i;
			for ( int  j= i+1; j <i ; j++) {
				
				if ( arr[j] < arr[i] ) {
					
					min = j;
				}
				
			
				
				
			}
			
			
			if (min !=i) {
				swap (arr, min ,i);
			}
		}
	}

	static void swap(int[] arr, int i, int j)
{
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
	
	
	static void Display( int arr[]) {
		int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
 
        System.out.println();
	}
	
	
	public static void main(String args[]) {
		
		int array[] = {1,2,4,8,3,6,9};
		
		SelectionSort obj = new SelectionSort();
		obj.selection(array);
		
		Display(array);
		
		
	}
	
}
