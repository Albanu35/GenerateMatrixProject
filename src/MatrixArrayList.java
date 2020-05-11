import java.util.ArrayList;

public class MatrixArrayList {

	public static void main(String[] args) {
		int n = 5, m = 6;

		ArrayList<ArrayList<Integer>> numbers;

		numbers = new ArrayList<ArrayList<Integer>>(n);
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> newRow = new ArrayList<Integer>(m);
			for (int j = 0; j < m; j++) {
				newRow.add(0);
			}
			numbers.add(newRow);
		}

		numbers.get(2).set(1, 101); // Number is on line 2, column 1.
		// Note: numbering starts at 0 (as always).
		// Look for number 101 in the image!
		numbers.get(0).set(0, 2); // first position in matrix
		numbers.get(4).set(5, 91); // last position in matrix
		numbers.get(3).set(3, 88);
		numbers.get(2).set(5, 55);
		numbers.get(3).set(0, 923);

//4. Accessing elements in the matrix
		System.out.println(numbers.get(2).get(5));
		System.out.println(numbers.get(2).get(4));

		for (int i = 0; i < numbers.size(); i++) {
			for (int j = 0; j < numbers.get(i).size(); j++) {
				System.out.println("Element on line " + i + " and column " + j + " is " + numbers.get(i).get(j));
			}
		}

		// 6. Printing the matrix (in space)
		for (int i = 0; i < numbers.size(); i++) {
			for (int j = 0; j < numbers.get(i).size(); j++) {
				System.out.print(numbers.get(i).get(j) + "\t");
			}
			System.out.println();
		}

		// Printing diagonal main
		System.out.println("diagonal main is: ");
		for (int i = 0; i < numbers.size(); i++) {
			for (int j = 0; j < numbers.get(i).size(); j++) {
				if (i == j) {
					System.out.print(numbers.get(i).get(j) + "\t");
				}

			}
		}

		System.out.println();
		System.out.println("diagonal second is: ");
		for (int i = 0; i < numbers.size(); i++) {
			for (int j = 0; j < numbers.get(i).size(); j++) {
				if (i + j == n - 1) {
					System.out.print(numbers.get(i).get(j) + "\t");
				}
			}

		}
	}
}
