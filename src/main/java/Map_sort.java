import java.util.HashMap;
import java.util.Map;

public class Map_sort {

	
	public static void main(String[] args) {
		
		Map<String, Employee> map = new HashMap<>();

		Employee employee1 = new Employee(1L, "Mher");
		map.put(employee1.getName(null), employee1);
		Employee employee2 = new Employee(22L, "Annie");
		map.put(employee2.getName(null), employee2);
		Employee employee3 = new Employee(8L, "John");
		map.put(employee3.getName(null), employee3);
		Employee employee4 = new Employee(2L, "George");
		map.put(employee4.getName(null), employee4);
		
	}
}
