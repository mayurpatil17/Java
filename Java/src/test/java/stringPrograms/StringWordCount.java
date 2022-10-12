package stringPrograms;

import java.util.HashMap;


public class StringWordCount {

	public static void main(String[] args) {
		String s="java is java and so java is java";
		String[] sp = s.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(String w:sp) 
		{
			if(hm.get(w) == null)
			hm.put(w,1);
			else
				hm.put(w, hm.get(w)+1);
			
		}
		System.out.println(hm);
	}
}





