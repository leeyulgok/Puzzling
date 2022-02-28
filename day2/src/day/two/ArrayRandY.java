package day.two;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandY {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요소 수 : ");
		int n = scan.nextInt();
		int[] x = new int[n];

		x[0] = 1 + rand.nextInt(10);
		
		for(int i = 1; i < x.length; i++) {
			do {
				x[i] = 1 + rand.nextInt(10); 
			} while(x[i] == x[i-1]);
		}
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}

	}

}
