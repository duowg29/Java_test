package bai_tap_tuan_1_2;


import java.lang.Math;

import java.util.Scanner;

public class bt4 {
	public static void main(String[] args) {
		double a,b,c;
		Scanner reader = new Scanner (System.in);
		System.out.print("a=");
		a=reader.nextDouble();
		System.out.print("b=");
		b=reader.nextDouble();
		System.out.print("c=");
		c=reader.nextDouble();
		double delta=b*b-4*a*c;
		double k=delta;
		double sqrtDelta = Math.sqrt(k);
		if(delta<0) {
			System.out.println("Phuong trinh vo nghiem");
		} if(delta==0) {
			System.out.println ("Phuong trinh co nghiem kep x1=x2=" + (-b/(2*a)));
		} if (delta>0){
			System.out.println("Phuong trinh co 2 nghiem phan biet la:\n"  + "x1=" + (-b+  sqrtDelta)/(2*a) + "\nx2=" + (-b- sqrtDelta)/(2*a));
		}
	}
}