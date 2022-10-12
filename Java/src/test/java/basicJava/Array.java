package basicJava;

public class Array {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		System.out.println(a);
		for(int i:a)
		{
			System.out.println(i+" ");
		}
		
		System.out.println("-------------------------");
		
		int[] b=new int[4];
		b[0]=1;
		b[1]=2;
		b[2]=3;
		b[3]=4;
		System.out.println(b.length);
		System.out.println("-------------------------");
		for(int n:b)
		{
			System.out.println(n+" ");
		}
		
System.out.println("-------------------------");
		
		int[] c= null;
		b[0]=1;
		b[1]=2;
		b[2]=3;
		b[3]=4;
		System.out.println(c.length);
		
		
		
		
		

	}

}
