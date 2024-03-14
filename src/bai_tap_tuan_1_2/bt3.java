package bai_tap_tuan_1_2;

import java.util.Scanner;

public class bt3 {
	public static void main(String[] args) {
		double a,b;
		Scanner reader = new Scanner (System.in);
		System.out.print("a=");
		a=reader.nextDouble();
		System.out.print("b=");
		b=reader.nextDouble();
		if(a==0)
		{
			if (b==0)
			{
				System.out.println("Phuong trinh vo so nghiem");
			}else
			{
				System.out.println("Phuong trinh vo nghiem");
			}
		}else {
			System.out.println("Phuong trinh co nghiem x= " + (-b/a));
		}
	}
}
