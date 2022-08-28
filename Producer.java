package pt;
class Producer extends Thread {
	Thread_company c;
	
	Producer(Thread_company c){
		this.c=c;
	}
	
	public void run() {
		int i = 0;
		while(true) {
			try {
				this.c.Producer_item(i);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try{Thread.sleep(1000);}catch(Exception e) {};
			
			i++;
		}
	}
}