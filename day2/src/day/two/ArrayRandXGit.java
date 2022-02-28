package day.two;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandXGit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요소 수 : ");
		int n = scan.nextInt();
		int[] x = new int[n];

		for(int i = 0; i < x.length; i++) {
			int j;
			do {
				j = 0;
				x[i] = 1 + rand.nextInt(10);
				for(; j < i; j++) {
					if(x[j] == x[i]) {
						break;
					}
				}
			} while(j < i);
		}
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}

	}

}
