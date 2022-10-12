package MisPrograms;

public class EqualsMethod {

	public static void main(String[] args) {
		String s1= new String("Mayur");
		String s2= new String("Mayur");
		String s3=s1;
		
		boolean equals = s1.equals(s2);
		System.out.println(equals);

		boolean eq = s1==s2;
		System.out.println(eq);
		
		boolean eq1 = s1==s3;
		System.out.println(eq1);
	}

}
