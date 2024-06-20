package programms;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] num = { 5, 2, 98, 50, 16 };
		int lastNum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}

		}
		lastNum = num[num.length - 1];
		List<Integer> list = new ArrayList<>();
		for (int k = num[0]; k < lastNum; k++) {
			for (int i = 0; i < num.length; i++) {
				if ((num[i] < k) && (num[i + 1] > k)) {
					list.add(k);
				}
			}
		}

		System.out.println(list);
	}

}
