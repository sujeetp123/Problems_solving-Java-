package pt;

class Zeros_1s_2s_sorting {

	/*static void sort012(int a[], int arr_size)
	{
		int lo = 0;
		int hi = arr_size - 1;
		int mid = 0, temp = 0;
		while (mid <= hi) {
			switch (a[mid]) {
			case 0: {
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
				hi--;
				break;
			}
			}
		}
	}
	
	*/
	
	
	static void Sort (int array[]) {
		
		 int low=0;
		  int mid =0;
		  int hg=array.length-1;
		  int temp=0;
		
		  while (mid <= hg) {
			  switch(array[mid]) {
			 
			  case  0: {
				  	temp= array[low];
				  	array[low]= array[mid];
				  	array[mid]=temp;
				  	low++;
				  	mid++;
				  	break;
				  
			  }
			  
			  case 1 : mid++ ;
			  break;
			  
			  
			  case 2 :{
				  
				  temp= array[mid];
				  
				  array[mid]=array[hg];
				  array[hg]=temp;
				 
				  hg--;
				  break;
				  
				  
			  }
			  
			 
			  }
			  	  
			  
		  }
		
	}
	
	static void printArray(int array[])
    {
        int i;
        for (i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }
	
	
	
	public static void main(String args[]) {

		int array[] = {0,0,0,2,1,2,1,1,1,2,2,2};
		System.out.println("========================sorted elements is given as=============================");
		//sort012(array,array.length);
		Sort(array);
		 System.out.println("segregation of array");
		 
		 printArray(array);
		
		/*for ( int i=0 ; i< array.length;i++) {
			
			System.out.print(array[i]);
			
		}*/
	}
	
	
	
	
	
}