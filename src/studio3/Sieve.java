package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("What is n?");
		int n = in.nextInt();

		boolean[] numbers = new boolean[n];
		for (int i = 1; i < n; i++) {
			numbers[i] = true;

		}
		for (int k = 2; k < Math.sqrt(n); k++) {
			if (numbers[k] = true) {
				for (int j = k * k; j < n; j += k) {
					numbers[j] = false;
				}
			}
		}
		// marked
		for (int i = 1; i < n; i++) {
			if (numbers[i] == true) {
				System.out.println(i);
			}
		}
	}
}
