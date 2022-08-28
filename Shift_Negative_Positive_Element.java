package pt;

class Shift_Negative_Positive_Element{

	static void Negative_Positive_shift( int arr[], int left,int right) {
		int temp=0;
		
		
		while( left <= right) {
			if ( arr[left] <0 && arr[right]<0 ) { // if the both elements is negative
				
				left ++;
				
			}
			else if ( arr[left] > 0 && arr[right]>0) { // if both elemnts are positive then
				right--;
				
			}
			else if(arr[left ]> 0 && arr[right]<0) { // if one left elemnts is positive and right elements are negative
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				
				left++;
				right--;
			}
			
			
			else {
				
				left++;
				right--;
	
				
			}
			
			
		}
		
		
		
	}
	
	
	static void Print( int arr []) {
		
		for ( int i =0; i< arr.length; i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		
	}
	
	
	
	
	public static void main(String args[]) {
		
		int arr []= {11,12, 3,-7,-2};
		
		Negative_Positive_shift(arr,0,arr.length-1);
		Print(arr);
		
	}
	
	
	
	
}