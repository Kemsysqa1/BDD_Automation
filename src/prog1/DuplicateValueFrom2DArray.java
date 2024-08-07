package prog1;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValueFrom2DArray {

	public static void main(String[] args) {
		int[][] no = { { 1, 3, 5 }, { 2, 5, 8 }, { 9, 4, 1 } };

		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicateValue = new HashSet<>();

		for (int i = 0; i < no.length; i++) {
			for (int j = 0; j < no[i].length; j++) {
				if (!set.add(no[i][j])) {
					duplicateValue.add(no[i][j]);
				}
			}
		}
		if (duplicateValue.isEmpty()) {
			System.out.println("Duplicate Values Not Found...!");
		} else {
			System.out.println("Duplicate Values: " + duplicateValue);
		}
	}

}
