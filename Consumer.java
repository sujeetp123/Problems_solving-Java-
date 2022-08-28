package pt;
class Consumer extends Thread {
	Thread_company c;
	
	Consumer(Thread_company c){
		this.c=c;
	}
	
	public void run() {
		int i = 0;
		while(true) {
			try {
				this.c.Consumer_item();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try{Thread.sleep(1000);}catch(Exception e) {};
			
			i++;
		}
	}
}