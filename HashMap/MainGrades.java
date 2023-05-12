package HashMap;

import java.util.Hashtable;

public class MainGrades {

	public static void main(String[] args) {

		Hashtable<Integer, String> table = new Hashtable<>(6);

		table.put(95, "Math");
		table.put(94, "English");
		table.put(97, "Science");
		table.put(93, "Filipino");
		table.put(98, "Research");
		table.put(92, "Theology");

		// Display your Grades

		System.out.println("My Grades in Different Subjects ");

		// calculate the average

		int sum = 0;

		for (Integer key : table.keySet()) {
			System.out.println(key.hashCode() + "\t" + table.get(key));
			sum += key;
		}

		// print the average

		double average = (double) sum / table.size();
		System.out.println("My Average Grade: " + average);
	}

}
