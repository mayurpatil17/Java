package Programes;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		int n = sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println(n+" is Even");
		}
		else
		{
			System.out.println(n+" is Odd");
		}
		
		

	}

}
