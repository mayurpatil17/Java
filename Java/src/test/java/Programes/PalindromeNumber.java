package Programes;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=12312, temp=n, rev=0,rem=0;
		
		while(temp!=0)
		{
			rem=temp%10;
     		rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(rev==n)
		{
			System.out.println(n+" is Palindrome");
		}
		else
			System.out.println(n+" is not palindrome number");
		
		
		
		
	}

}
