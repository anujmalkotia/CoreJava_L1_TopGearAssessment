package Topic_4;

import java.util.HashMap;

public class Assignment_4 {

	public static void main(String[] args)
	{
		HashMap<String, Integer> namephonemap = new HashMap<>(); 
		namephonemap.put("Neeraj", 1122334455); 
		namephonemap.put("vaibhav", 1234567890); 
		namephonemap.put("yajur", 1112223334); 
		namephonemap.put("garvit", 1122112233); 
		namephonemap.put("chitrank", 1234567654); 
        
        System.out.println(namephonemap.get("Neeraj"));
        System.out.println(namephonemap.get("yajur"));
        System.out.println(namephonemap.get("chitrank"));
        
	}

}
