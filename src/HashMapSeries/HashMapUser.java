package HashMapSeries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapUser {

	public static void main(String[] args) {
		Map<Integer, Employee> aMap = new HashMap<Integer, Employee>();
		
		Employee emp1 = new Employee( 101, "Ghochu");
		Employee emp2 = new Employee( 102, "Ghochi");
		Employee emp3 = new Employee( 103, "Ghonchi");
		Employee emp4 = new Employee( 104, "Ghonchai");
		
		aMap.put(emp1.getEmpId(), emp1);
		aMap.put(emp2.getEmpId(), emp2);
		aMap.put(emp3.getEmpId(), emp3);
		aMap.put(emp4.getEmpId(), emp4);

		Set<Map.Entry<Integer, Employee>> entries = aMap.entrySet();
		
		for(Map.Entry<Integer, Employee> entry : entries) {
			
			System.out.println(entry.getKey());
			
			Employee employee = entry.getValue();
			System.out.println(employee);
		}
	}
	


}
