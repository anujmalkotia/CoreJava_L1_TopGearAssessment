package Topic_3;

public class Assignment_5 {

	public static void main(String[] args) {
		String str = "hello world";
		String c = "l";
		int count = str.length() - str.replace(c,"").length();
		System.out.println("no.of occurrences of l is  " + count);
	}

}
