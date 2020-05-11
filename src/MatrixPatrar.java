import java.util.ArrayList;

public class MatrixPatrar {

	public static void main(String[] args) {
		int n = 5, m = 5;

		ArrayList<ArrayList<Integer>> numbers;

		numbers = new ArrayList<ArrayList<Integer>>(n);
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> newRow = new ArrayList<Integer>(m);
			for (int j = 0; j < m; j++) {
				newRow.add(0);
			}
			numbers.add(newRow);
		}


	}

}
