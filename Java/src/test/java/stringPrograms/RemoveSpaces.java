package stringPrograms;

public class RemoveSpaces {

	public static void main(String[] args) {
		String s="Java is high programming language";
		String[] sp=s.split(" ");
		
		for(String st:sp )
		{
			System.out.print(st);
		}

	}

}
