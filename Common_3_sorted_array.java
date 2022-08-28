package pt;
class Common_3_sorted_array{
	
	public static void main(String args[])
	{
		
	 int a1 []= {1,2,3,6};
	 int a2 [] = {1,2,3,6};
	 int a3 [] = {1,2,3,6};
	 int x=0;
	 int y=0;
	 int z=0;
	
	while( x< a1.length-1 &&  y< a2.length-1 &&  z< a3.length-1 ){
	
	if ( a1[x]==a2[y] && a2[y]==a3[z]){
	x++; y++; z++	;

	}
	else if ( a1[x] < a2[y]){
	y++;
	}	
	else if (  a1[y] < a2[z])

	{	
	z++;
	}

	}		
	
	}
}