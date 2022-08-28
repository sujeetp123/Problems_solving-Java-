package pt;

public class MorreVoting {
	
	
	static int MooreElement(int arr[],int n) {
		
		
		int maj=0, count=1;
		
		for(int i=1;i<n;i++)
		{
			
			if(arr[maj]==arr[i]) {
				count++;
			}
			else {
				count--;
			}
				
			
			if(count==0)
				maj=i;
				count=1;
	
		}
		return arr[maj];
		
		
		
	}
	
	
	
	static boolean  MainMaj(int arr[], int n,int cand)
	{
		int count =0;
		for(int i=0;i<n;i++)
			if( arr[i]==count)
				count++;
		
		if(count>n/2)
			return true;
		else 
			return false;
		
	}
	
	
	
	public static void main(String arg[])
	{
		int arr[] = {1,1,1,1,3,4,5,3};
		int n=arr.length;
		int cand=MooreElement(arr,n);
		boolean res=MainMaj(arr,n,cand);
		if (res==true)
			System.out.println(cand);
			else
				System.out.println("Not Major Element");
	}

}
