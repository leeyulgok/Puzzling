package day.two;

import java.util.Scanner;

public class LinearSearchTop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int n = scan.nextInt();
		int[] x = new int[n];
		
		for(int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]= ");
			x[i] = scan.nextInt();
		}
		System.out.print("찾을 숫자 : ");
		int y = scan.nextInt();
		
		for(int i = 0; i < x.length; i++) {
			if(y == x[i]) {
				System.out.println("그 값은 x[" + i + "]에 있습니다.");
				break;
			}
		}

	}

}
