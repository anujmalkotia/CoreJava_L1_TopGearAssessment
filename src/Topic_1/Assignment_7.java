package Topic_1;


public class Assignment_7 {

	public static void main(String[] args) {
		int f =fact(5);
		System.out.println(f);
	}

	private static int fact(int n) {
		if(n==1)
			return 1;

		return n*=fact(n-1);
	}


}


