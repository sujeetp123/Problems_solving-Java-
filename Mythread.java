package pt;

 class Mythread implements Runnable
{
	@Override	
	public void run() {
		for( int i=0 ;i <5;i++) {
			System.out.println("Hii");
			try {Thread.sleep(2000);}catch(Exception e) {};
		}
		
	}
	
	
	
	
	public static void main(String args[]) {
		Mythread t1 =new Mythread();
		Thread thr = new  Thread(t1);
		thr.start();
		
		MyAnotherthread t2  = new  MyAnotherthread();
		t2.start();
		// creating acll thread 3
		MyAnotherthread2 t3 = new MyAnotherthread2();
		t3.start();
	}

	

	
}