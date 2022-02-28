package day.two;

import java.util.Scanner;

public class PointSumAve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("사람 수 : ");
		int n = scan.nextInt();
		int[] x = new int[n];
		int sum = 0;
		int avg = 0;

		for(int i = 0; i < x.length; i++) {
			System.out.print(i+1 + "번의 점수 : ");
			x[i] = scan.nextInt();
			sum += x[i];
		}
		avg = sum / n;
		
		int max = x[0];
		int min = x[0];
		
		for(int i = 0; i < x.length; i++) {
			if(x[i] > max) {
				max = x[i];
			}
			if(x[i] < min) {
				min = x[i];
			}
		}
		
		System.out.println("합계는 " + sum + "점입니다.");
		System.out.println("평균은 " + avg + "점입니다.");
		System.out.println("최고점은 " + max + "점입니다.");
		System.out.println("최저점은 " + min + "점입니다.");
	}

}
