package Topic_1;

import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:::");
		int number = sc.nextInt();
		
		int sum=0;
		
		while(number>0)
		{
			int digit = number%10;
			sum=sum+digit;
			number = number/10;
		}
		System.out.println(sum);
			

	}

}
