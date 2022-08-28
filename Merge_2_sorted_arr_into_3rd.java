package pt;
import java.util.*;
class Merge_2_sorted_arr_into_3rd {
	
	static void Merge( int a1[], int a2[] ,int res[] ) {
		int i=0,j=0,k=0;
		int size1=a1.length;
		int size2= a2.length;
		
		while( i < size1 && j < size2) {
			
			if( a1[i] <a2[j]) {
				res[k]= a1[i];
				i++; k++;
			}
			else
			{
				res[k]= a2[j];
				j++; k++;
			}
			
			
		}
		
		
		while( i< size1) {
			res[k++]= a1[i++];
		}
		
		while( j< size2) {
			res[k++]= a2[j++];
		}
	
	}
	
	static void printArray(int[] arr, int size)
	{
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
			
		System.out.println();
	}
	
	
	
	
	
	public static void main(  String args[] ) {
	
		int a1[] = { 2,3,4};
		int a2[] =  { 6,7,8,9,10,11,12};
		int res[] = new int [10];
		
		Merge(a1,a2,res);
		printArray(res,res.length);
		
	}
	
	
	
}