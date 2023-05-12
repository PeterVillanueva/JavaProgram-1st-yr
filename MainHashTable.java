import java.util.*;

public class MainHashTable {

	public static void main(String[] args) {

		Hashtable<Integer, String> table = new Hashtable<>(10);
		// Hashtable<String, String> table = new Hashtable<>(21);

		table.put(100, "Spongebob");
		table.put(123, "Patcrick");
		table.put(321, "Sandy");
		table.put(555, "Squidward");
		table.put(777, "Gary");
		/*
		 * table.put("100", "Spongebob"); table.put("123", "Patcrick"); table.put("321",
		 * "Sandy"); table.put("555", "Squidward"); table.put("777", "Gary");
		 */

		// table.remove(777); remove
		// Integer
		for (Integer key : table.keySet()) {
			System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + table.get(key));
		}

		// System.out.println(table.get(100));
	}

}
