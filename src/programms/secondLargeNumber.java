package programms;

import java.util.Scanner;

public class secondLargeNumber {

	public static void main(String[] args) {
		int[] num = { 4, 5, 6, 57, 3, 214, 5, 3, 412, 12, 365, 4, 3, 24, 23, 536, 36, 243, 1, 234, 5 };
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		Scanner scn = new Scanner(System.in);
		System.out.println("Input Your Value..!");
		int input = scn.nextInt();

		int no = num[num.length - input];

		System.out.println(no);
	}

}
