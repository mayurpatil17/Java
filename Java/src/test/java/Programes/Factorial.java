package Programes;

public class Factorial {

	public static void main(String[] args) {
		int a=4, n=a, fact=1;
		while(n!=0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("Factorial of "+a+" is "+fact);
	}
}
