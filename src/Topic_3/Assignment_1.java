package Topic_3;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) throws InvalidAgeException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:::");
		String name = sc.next();
		System.out.println("Enter age:::");
		int age = sc.nextInt();
		
		if(age<18 || age >=60)
		{
			throw new InvalidAgeException();
		}
		System.out.println("Name:" + name + "\n Age:" + age);

	}

}
