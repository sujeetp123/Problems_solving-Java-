package pt;
class KthElement_in_array {
    // finding kth smallest elements in array
        public static void main(String args[]){
        
        int arr[] = {1321,2122,412,5,54};
        int temp;
        int k=3;
        for ( int i =0; i< arr.length ;i++){
            
                for ( int j =i+1 ; j <arr.length  ; j ++){
                    
                    if ( arr[i] > arr[j]){
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                        
                        
                    }
                    
                    
                    
                    
                }
                
                if (i ==k-1 ) {
                	System.out.println("The kth smallest elements is :" +arr[k-1]);
                	break;
                }
          
        }
    
    }
    
    
    
    
    
}
