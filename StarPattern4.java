package Assignment1;

import java.util.Scanner;

public class StarPattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		int space = rows-1;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			space--;
			for(int j =1; j <= 2*(i+1)-1; j++) {
				if(i == rows-1 || j == 1 || j == 2*(i+1)-1)
					System.out.print("*");
				else
					
					System.out.print(" ");
			}
			System.out.println();
		}
		space =1;
		for(int i = 1; i <= rows-1; i++) {
			for(int j = 1; j<=space;j++) {
				System.out.print(" ");
			}
			space++;
			for(int j = 1; j <= 2*(rows-i)-1; j++) {
				if(j==1 || j == 2*(rows-i)-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
