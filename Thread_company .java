package pt;
class Thread_company{
	 int n;
	 boolean f=false;
	 // f false chance of producer
	 // f true chance of consumer
	 
	 
	synchronized public void Producer_item(int n) throws Exception {
		this.n=n;
		
		if(f) {
			wait();
		}
		System.out.println("The Producer items:"+this.n);
		f=true;
		notify();
		
	}
	synchronized public int Consumer_item() throws Exception {
		if(!f) {
			wait();
		}
		
		System.out.println(" the consumer Items: " +this.n);
		f=false;
		notify();
		return this.n;
		
	}
	
	
}