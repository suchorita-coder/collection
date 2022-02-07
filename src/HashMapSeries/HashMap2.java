package HashMapSeries;

import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {
			
		HashMap<String,String> HMP2 = new HashMap<String,String>();
		
		HMP2.put("Ghochu007", "Ghucho@123");
		HMP2.put("Ghochi009", "Ghucho@1234");
		HMP2.put("Ghonchai003", "Ghucho@12345");
		
		System.out.println(HMP2);
		System.out.println(HMP2.containsValue("Ghonchai003")); // False
		System.out.println(HMP2.containsKey("Ghonchai003")); //TRUE
		System.out.println(HMP2.replace("Ghonchai003","Ghucho@12"));
		System.out.println(HMP2);
		System.out.println(HMP2.keySet());


		
	}

}
