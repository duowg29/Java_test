package bai_tap_tuan_1_2;

import java.util.Scanner;

public class bt7 {
	public static void main(String[] args) {
		double tmp=1;
		int n;
		Scanner reader = new Scanner (System.in);
		System.out.print("Nhap so tu nhien N= ");
		n = reader.nextInt();
		
		if(n>1) {
			for (int i=2;i<n+1;i++) {
				tmp *=i;
			}
		}
		System.out.println(n + "! = " + tmp);
	}

}
