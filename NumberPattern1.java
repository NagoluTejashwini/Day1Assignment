package Assignment1;

import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		int k = 0;
		for(int i = 0; i < rows; i++) {
			for(int j =0; j <= i; j++) {
				k++;
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
