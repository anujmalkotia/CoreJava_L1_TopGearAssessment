package Topic_4;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment_5 {

	public static void main(String[] args) 
	{
		HashSet<String> empset = new HashSet<>();
		
		empset.add("Neeraj");
		empset.add("vaibhav");
		empset.add("chitrank");
		empset.add("yajur");
		empset.add("garvit");
		
		Iterator<String> it = empset.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
