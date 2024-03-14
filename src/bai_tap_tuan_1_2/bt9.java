package bai_tap_tuan_1_2;

import java.util.Scanner;

public class bt9 {
	public static void main(String[] args) {
		int n;
		System.out.print("Nhap n = ");
		Scanner reader = new Scanner(System.in);
		n=reader.nextInt();
		int[] F = new int[n];
		F[0]=1;
		F[1]=1;
		for(int i=2;i<n;i++) {
			F[i]=F[i-2]+F[i-1];
		}
		System.out.print("So fibonanci thu n la " + F[n-1]);
	}
}
