package temaMatrix;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int m;
		int numbers[][];
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
		if (m%2 == 1) {
		centerValue = sc.nextInt();
		}
		leftValue = sc.nextInt();
		upValue = sc.nextInt();
		rightValue = sc.nextInt();
		downValue = sc.nextInt();
		
		
		numbers = new int[m][m];
		
		// Printing the matrix (in space)
		for(int i=0; i < numbers.length; i++) {
		  for (int j = 0; j < numbers[i].length; j++) {
			  if (m%2 == 1) {
				  if (i == j && i != m/2) {
					  numbers[i][j] = mainDiagValue;
					 System.out.print(numbers[i][j] + "\t");  
				  }else if (i+j == m-1 && i != m/2) {
					  numbers[i][j] = scDiagValue;
					 System.out.print(numbers[i][j] + "\t"); 
				  }else if (i == j && i == m/2) {
					  numbers[i][j] = centerValue;
					  System.out.print(numbers[i][j] + "\t");
				  }else if (i > j && i +j < m - 1) {
					 numbers[i][j] = leftValue; 
					 System.out.print(numbers[i][j] + "\t");
				  }else if (i < j && i +j < m - 1) {
					  numbers[i][j] = upValue;
					  System.out.print(numbers[i][j] + "\t");
				  }else if (i < j && i + j > m - 1) {
					  numbers[i][j] = rightValue;
					  System.out.print(numbers[i][j] + "\t");
				  }else if (i > j && i + j > m - 1) {
					  numbers[i][j] = downValue;
					  System.out.print(numbers[i][j] + "\t");
				  }  
			  }else {
				  if (i == j) {
					  numbers[i][j] = mainDiagValue;
					 System.out.print(numbers[i][j] + "\t");  
				  }else if (i+j == m-1) {
					  numbers[i][j] = scDiagValue;
					 System.out.print(numbers[i][j] + "\t"); 
				  }else if (i > j && i +j < m - 1) {
					 numbers[i][j] = leftValue; 
					 System.out.print(numbers[i][j] + "\t");
				  }else if (i < j && i +j < m - 1) {
					  numbers[i][j] = upValue;
					  System.out.print(numbers[i][j] + "\t");
				  }else if (i < j && i + j > m - 1) {
					  numbers[i][j] = rightValue;
					  System.out.print(numbers[i][j] + "\t");
				  }else if (i > j && i + j > m - 1) {
					  numbers[i][j] = downValue;
					  System.out.print(numbers[i][j] + "\t");
				  }
			  }
			 
		   
		  }
		  System.out.println();
		}
		

	}

}
