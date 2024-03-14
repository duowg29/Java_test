package bai_tap_tuan_1_2;

import java.util.Scanner;

public class bt5 {
	public static void main(String[] args) {
		int n;
		double sum=0;
		Scanner reader = new Scanner (System.in);
		System.out.print("Nhap gia tri nguyen duong N = ");
		n=reader.nextInt();
		for (int i=1;i<n+1;i++) {
			sum+=i;
		}
		System.out.println("Tong S =" + sum);
	}
}
