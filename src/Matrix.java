
public class Matrix {

	public static void main(String[] args) {
		int[][] numbers;
		numbers = new int[5][6];
		
		numbers[0][0] = 9;
		numbers[1][1] = 10;
		numbers[2][2] = 11;
		numbers[3][3] = 12;
		numbers[4][4] = 13;
		numbers[4][5] = 14;
		
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++){
				System.out.print(numbers[i][j] + "\t");
			}
			System.out.println();
		}
		

	}

}
