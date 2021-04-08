package Assignment1;

import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		int k = 2, l=1;
		for(int i = 0; i < rows; i++) {
			for(int j =0; j <= i; j++) {
				if(i%2 == 0) {
					System.out.print(l+" ");
					l+=2;
				}
				else {
					System.out.print(k+" ");
					k+=2;
				}
			}
			System.out.println();
		}

	}

}  
