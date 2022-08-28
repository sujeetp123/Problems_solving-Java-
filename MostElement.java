package pt;
import java.util.*;
public class MostElement {

	
// Function start
	
	
	
	 static  void MaxElement( int arr[],int n) {
		int maxcount=0;
		int indx = -1;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0; j<n;j++) {
				if(arr[i]==arr[j])
				{
					count++;
					//int indx=i;
				}
				
			}
			if (count>maxcount)
				maxcount=count;
			//System.out.println(maxcount);
			 indx=i;
		
		}
		
		if(maxcount>n/2)
		{
			System.out.println("The Most Major Element is::"+arr[indx]);
		}
		else
		{
			System.out.println("Not a Major Element");
		}
		
		
	}
	
	
	
	
	
	public static void main(String arg[]) {
	
		int arr[]= {1,2,3,2,1,4,2,1,1,1,1};
		int n=arr.length;
		
		MaxElement(arr,n);
		
	}
	
	
	
}
