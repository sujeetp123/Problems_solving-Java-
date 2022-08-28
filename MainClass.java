package pt;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String arg[])
	{
		Map<String,Integer> map = new HashMap<>();
		map.put("one",1);
		map.put("two",2);
		map.put("three",3);
		map.put("four",4);
		
		map.remove("two");
//		System.out.println(map);
//		System.out.println(map.keySet());
//		System.out.println(map.values());
		for(String i : map.keySet()) {
			System.out.println(" the Key is" + i +" with values is "+ map.get(i));
		}
		
		
	}
	
	
	
}
