package pt;
class ThreadOP{
	public static void main(String args[]) {
		System.out.println(" threads starting running ....");
		
		int sum=48+78;
		System.out.println(" the Adiition "+ sum);
		System.out.println( " the end of thread................");
		
		Thread t =Thread.currentThread();
		
		 t.setName("Mythread111");
		 String  tname= t.getName();
		System.out.println(tname);
		System.out.println(t.getId());
			
	}
	
}