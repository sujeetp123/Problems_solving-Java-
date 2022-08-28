package pt;




class PassChecker {
	
	
	   static int CheckPassword(String str, int n)
	    {
	        boolean isLen=false, isNum=false, isCap=false, isSpace=true, isFirst=true, isSpecialCha=true;
	        if(str.length()>=4)
	            isLen=true;
	        
	      //  if(Character.isDigit(str.charAt(0)))
	     //       isFirst=false;
	        char[] ch=str.toCharArray();
	        a[] cha1r= str.toCharArray();
	        for (int i = 0; i < ch.length; i++) {
	            if(Character.isDigit(ch[i]))
	                isNum=true;
	            if(ch[i]>=65 || ch[i]<=97)
	                isCap=true;
	            if(ch[i]==' ' || ch[i]=='/')
	                isSpace=false;   
	            
	            if(ch[i] != '@')
	            	isSpecialCha=true;
	            
	        }
	        if(isLen && isNum && isCap && isSpace && isFirst&&isSpecialCha)
	            return 1;
	        else
	            return 0;
	    }
	    public static void main(String[] args) {
	        System.out.println(CheckPassword("aA1_67",6));
	    }
	}
