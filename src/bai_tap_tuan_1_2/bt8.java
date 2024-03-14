package bai_tap_tuan_1_2;

import java.util.Scanner;

public class bt8 {
	public static void main(String[] args) {
		double S=0;
		int n;
		Scanner reader = new Scanner (System.in);
		System.out.print("Nhap so tu nhien N = ");
		n=reader.nextInt();
		for(int j=1;j<n+1;j++) {
			double tmp=1;
			for(int i=1;i<j+1;i++) {
				tmp*=i;
			}
			S+=j/tmp;
		}	
		System.out.println("S= " +S);
	}
}