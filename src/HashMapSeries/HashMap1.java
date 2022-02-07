package HashMapSeries;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 38;
		int c = 51;
		
		HashMap<String, Integer> HMP = new HashMap<String, Integer>();
		HMP.put("a", 10);
		HMP.put("b", 38);
		HMP.put("c", 51);
		
		System.out.println(HMP);

		System.out.println(HMP.get("c"));

		System.out.println(HMP.get("c"));

		
	}

}
