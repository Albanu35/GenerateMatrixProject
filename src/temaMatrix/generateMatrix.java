package temaMatrix;

import java.util.ArrayList;
import java.util.Scanner;

public class generateMatrix {
	public static void generate(ArrayList<ArrayList<Integer>> numbers, int m) {
		for (int i = 0; i < m; i++) {
			ArrayList<Integer> newRow = new ArrayList<Integer>(m); // new row
			for (int j = 0; j < m; j++) {

				newRow.add(0);
			}
			numbers.add(newRow);
		}
	}

	public static void printMatrix(ArrayList<ArrayList<Integer>> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			for (int j = 0; j < numbers.get(i).size(); j++) {
				System.out.print(numbers.get(i).get(j) + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int m;
		// 1. Defining a new bi-dimensional array, using ArrayList
		ArrayList<ArrayList<Integer>> numbers;
		int mainDiagValue;
		int scDiagValue;
		int centerValue = 0;
		int leftValue;
		int upValue;
		int rightValue;
		int downValue;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti datele matricei:");
		m = sc.nextInt();
		mainDiagValue = sc.nextInt();
		scDiagValue = sc.nextInt();
		if (m % 2 == 1) {
			centerValue = sc.nextInt();
		}
		leftValue = sc.nextInt();
		upValue = sc.nextInt();
		rightValue = sc.nextInt();
		downValue = sc.nextInt();

		numbers = new ArrayList<ArrayList<Integer>>(m);
		
		generate(numbers, m);

		// update value of elemnts
		for (int i = 0; i < numbers.size(); i++) {
			for (int j = 0; j < numbers.get(i).size(); j++) {
				if (m % 2 == 1) {
					if (i == j && i != m / 2) {
						numbers.get(i).set(j, mainDiagValue);
					} else if (i + j == m - 1 && i != m / 2) {
						numbers.get(i).set(j, scDiagValue);
					} else if (i == j && i == m / 2) {
						numbers.get(i).set(j, centerValue);
					} else if (i > j && i + j < m - 1) {
						numbers.get(i).set(j, leftValue);
					} else if (i < j && i + j < m - 1) {
						numbers.get(i).set(j, upValue);
					} else if (i < j && i + j > m - 1) {
						numbers.get(i).set(j, rightValue);
					} else if (i > j && i + j > m - 1) {
						numbers.get(i).set(j, downValue);
					}
				} else {
					if (i == j) {
						numbers.get(i).set(j, mainDiagValue);
					} else if (i + j == m - 1) {
						numbers.get(i).set(j, scDiagValue);
					} else if (i == j) {
						numbers.get(i).set(j, centerValue);
					} else if (i > j && i + j < m - 1) {
						numbers.get(i).set(j, leftValue);
					} else if (i < j && i + j < m - 1) {
						numbers.get(i).set(j, upValue);
					} else if (i < j && i + j > m - 1) {
						numbers.get(i).set(j, rightValue);
					} else if (i > j && i + j > m - 1) {
						numbers.get(i).set(j, downValue);
					}
				}

			}
		}
	printMatrix(numbers);
	}
}
