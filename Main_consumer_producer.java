package pt;
class Main_consumer_producer{
	
	public static void main(String args[]) {
	Thread_company com= new Thread_company();
	Producer p =new Producer(com);
	Consumer c =new Consumer(com);
	p.start();
	c.start();
	
}}