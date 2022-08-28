package pt;
import java.util.*;
class Kadane_algo
{
	
	
	public static void main (String args[]) {
		int array [] =  {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int result =Largest_array_sum(array);
		System.out.println(" The maximum  contiguous  sum  is :" + result);
		
	}	
	

	
	static int Largest_array_sum( int arra[]) {
		
		int min_start =Integer.MIN_VALUE; 
		int var_end=0;
		
		for ( int i =0; i<arra.length ; i++)
		{
			var_end= var_end + arra[i];
			if (var_end <0) {
				var_end=0;
				
			}
			 if( var_end > min_start)
			 {
				 min_start=var_end;
			 }
			
		}
		return min_start;
		
	}
	
	
	


}