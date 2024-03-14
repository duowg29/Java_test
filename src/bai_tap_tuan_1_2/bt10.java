package bai_tap_tuan_1_2;

import java.util.Scanner;

public class bt10 {
	public static void main(String[] args) {
	    int number,n;
		System.out.print("Nhap so = ");
		Scanner reader = new Scanner(System.in);
		number=reader.nextInt();
		int sum=0;
		while (number!=0) {
			sum+=number%10;
			number/=10;
		}
		System.out.print(sum);
	}

}
