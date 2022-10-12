package stringPrograms;

public class P {

	public static void main(String[] args) {
		String s="ABCABCAXY";
		char[] ch=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
			System.out.print(ch[i]);
		}
		


	}

}
