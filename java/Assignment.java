package java2;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the traffic signal light");
		String str = input.nextLine();
		switch (str) {
		
		case "yellow":
			System.out.println("caution");
			
		case "green":
			System.out.println("ready to proceed");
			break;

		case "red":
			System.out.println("stop");
			break;

		default:
			System.out.println("traffic repair");
			for(int i=2; i<=20; i+=2) // odd numbers
			{
				System.out.println(i);
			}

			for(int i=1; i<=20; i+=2) //even numbers
			{
				System.out.println(i);
			}

		}

	}

}
