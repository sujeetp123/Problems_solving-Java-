package pt;

class Reverse_Array{
	
	
	static void rverseArray(int arr[], int initial_point,int final_point ) {
		
		int temp ;
		
		while(final_point > initial_point) {
			
			 temp = arr[initial_point];
			
			arr[initial_point] =arr[final_point];
			
			arr[final_point]= temp;
			
			
			
			initial_point ++;
			final_point --;
			
			
		}
		
		
	} 
	
	
	static void print_Array(int arr[], int n) {
		
		int i;
		
		
		for(i=0 ; i<n; i++) {
			
			System.out.print(arr[i]+ " ");
		}
		
		
	}
	
	
	public static void main(String args[]) {
		
		int arra[] = {1,2,3,4,5,6};
		
		print_Array(arra,6);
		rverseArray(arra,0,5);
		
		System.out.println(" The Reverse of array \n");
		print_Array(arra,6);
		
		
		
		
		
	}
	
	
	
}