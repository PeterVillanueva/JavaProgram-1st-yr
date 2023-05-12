package HashTables;

import java.util.Hashtable;

public class HashInt {

	public static void main(String[] args) {

		Hashtable<Integer, String> table = new Hashtable<>();

		table.put(100, "Spongebob");
		table.put(123, "Patcrick");
		table.put(321, "Sandy");
		table.put(555, "Squidward");
		table.put(777, "Gary");
		
		for (Integer key : table.keySet()) {
			System.out.println(key + "\t" + table.get(key));
		}

	}

}
