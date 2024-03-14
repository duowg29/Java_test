package bai_tap_tuan_1_2;

import java.util.Scanner;

public class bt11 {
	public static void main(String[] args) {
		int number;
		Scanner reader = new Scanner(System.in);
		System.out.print("Nhap vao so: ");
		number=reader.nextInt();
		int i;
		for(i=2;i<number;i++) {
			if (number%i==0) {
				System.out.print("So tren khong phai so nguyen to");
				i=number+1;
			}
		} 
		if(i==number)System.out.print("So tren la so nguyen to");
	}
}
