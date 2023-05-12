package HashMap;

import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<>(6);

		table.put(95, "CC 201");
		table.put(97, "CC 202");
		table.put(98, "CC 203");
		table.put(94, "CIT 202");
		table.put(96, "CIT 203");
		table.put(99, "CIT 204");

		System.out.println("My Grades in Different Majors: ");
		
		int sum = 0;
		for (Integer key : table.keySet()) {
			System.out.println(key.hashCode() + "\t" + table.get(key));
			sum += key;
		}
		
		double average = (double) sum / table.size();
		System.out.println("My Average Grade is: " + average);

	}

}
