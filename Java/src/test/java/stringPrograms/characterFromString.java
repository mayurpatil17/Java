package stringPrograms;

public class characterFromString {

	 
	public static void main(String[] args) {
		String s="hello";
		char ch='l';

		int count=0;
		for(int i=0;i<s.length();i++)
		{

			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(ch+"="+count);

	}

}
