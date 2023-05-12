
import java.util.Hashtable;

public class Grades {

	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<>();

		table.put(99, "CC 202");
		table.put(95, "CC 203");
		table.put(97, "CC 201");
		table.put(98, "CIT 202");
		table.put(93, "CIT 203");
		table.put(92, "CIT 204");

		// print your grades

		System.out.println("My Grades in Different Majors: ");

		// calculate the average

		int sum = 0;

		for (Integer key : table.keySet()) {
			System.out.println(key.hashCode() + "\t" + table.get(key));
			sum += key;
		}

		// display the average

		double average = (double) sum / table.size();
		System.out.println("My Average Grade is: " + average);
	}

}
