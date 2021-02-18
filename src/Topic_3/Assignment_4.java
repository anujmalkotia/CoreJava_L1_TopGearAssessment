package Topic_3;

public class Assignment_4 {

	public static void main(String[] args) {
		String str = "hello";
		if(palindrom(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

private static boolean palindrom(String str) {
	int i = 0 ;
	int j = str.length()-1;
	while(i<j)
	{
		if(str.charAt(i)!=str.charAt(j))
		{
			return false;
		}
		i++;
		j--;
	}
	return true;
	}

}
