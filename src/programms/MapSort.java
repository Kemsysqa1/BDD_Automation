package programms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSort {

	// Sorting map by values

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		map.put(5, 5);
		map.put(2, 2);
		map.put(9, 8);
		map.put(11, 12);
		map.put(7, 6);
		map.put(1, 98);

		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());

		System.out.println(list);
	}
}