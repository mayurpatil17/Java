package stringPrograms;

public class mailID {

	public static void main(String[] args) {
		String s="Mayurpatil638@gmail.com";
		 
		StringBuffer up=new StringBuffer();
		StringBuffer lo=new StringBuffer();
		StringBuffer di=new StringBuffer();
		StringBuffer sp=new StringBuffer();
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				up.append(s.charAt(i));
			}
			
			else if(Character.isLowerCase(s.charAt(i)))
			{
				lo.append(s.charAt(i));
			}
			
			else if(Character.isDigit(s.charAt(i)))
			{
				di.append(s.charAt(i));
			}
			else 
			{
				sp.append(s.charAt(i));
			}
		}
		System.out.println(up);
		System.out.println(lo);
		System.out.println(di);
		System.out.println(sp);
		
		
	}

}
