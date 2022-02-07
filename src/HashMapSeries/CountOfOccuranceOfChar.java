package HashMapSeries;

import java.util.HashMap;

public class CountOfOccuranceOfChar {

	/*
	 * The Number of occurrence of each character in the string using HashMap
	 * java is
	 * j 1
	 * a 2
	 * v 1
	 * ' ' 1
	 * i 1
	 * s 1
	 * key = character value = its's occurrence count
	 */		
	public static void main(String[] args) {
		 String string = "suchoritapodder";
		 int count ;
		 char ch;
		 HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		 for (int i = 0 ;i< string.length(); i++) {
			 ch = string.charAt(i);
			 if(hashMap.containsKey(ch)) {
				 count = hashMap.get(ch);
				 count++;
				 hashMap.replace(ch, count);
			 }else {
				 hashMap.put(ch, 1);
			 }
		 }
		 for(Character key : hashMap.keySet()) {
			 System.out.println(key+ " =" +hashMap.get(key));
		 }
	}

}
