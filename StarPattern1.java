package Assignment1;

import java.util.Scanner;

public class StarPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		int space = rows-1;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j<space; j++) {
				System.out.print(" ");
			}
			space--;
			for(int j =0; j < 2*(i+1)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
