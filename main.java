package pt;

class emp 
{
	 String name="vasunmdhara";
	int id=1;
	 double sal=122344;
	 String add="plot1";
	 
	 @Override
	public String toString() {//toString method override
System.out.println(id);
System.out.println(name);
System.out.println(sal);
System.out.println(add);
		return super.toString();
	}
   void info()
   {
	   System.out.println(id);
	}

   void info1()
   {
	   System.out.println(name);
   }
   void displ()
   {
	   System.out.println(add);
	   
   }
  void disp()
  {
	  System.out.println(sal);

}
}

public class main {
  public static void main(String[] args) {
	emp s= new emp();
	s.info1();
	s.info();
	s.disp();
	s.displ();
	
	
}
}


