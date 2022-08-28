package pt;

public class Duplicate_string {
public static void main(String args[])
{
String str1="java developer";
int count=0;
char[] charray = str1.toCharArray();

for( int i=0; i< charray.length; i++ ) {
	
	for ( int j =i+1 ; j< charray.length; j++) {
		
		
		if(charray[i]==charray[j])
		{
			
			count++;
		}
	}
	
	if(count>1) {
		System.out.println("the duplicate character in string as   => " + charray[i]);
	}
	
}

	
}
	
	
	
}
