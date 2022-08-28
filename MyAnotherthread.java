package pt;
class MyAnotherthread extends Thread{
	
	@Override
	public void run() {
		for( int i =0 ; i <5 ; i++) {
			System.out.println("Hello");
			try{Thread.sleep(2000);} catch(Exception e) {}
			
		}
	}
	
	
	
}
