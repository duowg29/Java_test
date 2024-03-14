package bai_tap_tuan_1_2;

import java.util.Scanner;

public class bt12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		//nhap vao so luong phan tu cua mang
		System.out.print("Nhap vao so luong phan tu cua mang: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		//Nhap vao mang
		System.out.print("Nhap vao cac phan tu cua mang: ");
		for(int i=0;i<n;i++){
			array[i] = scanner.nextInt();
		}
		
		//a)xuat cac gia tri cua mang
		System.out.println("Cac phan tu cua mang la: ");
		for(int i=0;i<n;i++){
			System.out.print(array[i] + " ");
		}
		//b)Tim gia tri lon nhat 
		int max = array[0];
		for (int i=1;i<n;i++) {
			if (array[i]>max) max = array[i];
		}
		System.out.println("\nSo lon nhat la: " + max);
		//c)Dem so phan tu la so chan
		int even=0;
		for (int i=0;i<n;i++) {
			if (array[i]%2==0) even++;
		}
		System.out.println("So cac so chan trong mang la: " + even);
		//d)Tim cac phan tu la so nguyen to
		System.out.print("Cac so nguyen to la: ");
		for (int i=0;i<n;i++) {
			int m=0;
			for (int j=2;j<array[i] ; j++) {
				if (array[i]%j==0) m++;
			}
			if (m==0) System.out.print(array[i]+ " ");
		}
		//e)Sap xep mang tang dan
		int temp;
		for (int i=0;i<n-1;i++) {
			for (int j=i+1;j<n;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("\nCac phan tu cua mang sau khi sap xep tang dan la: ");
		for(int i=0;i<n;i++){
			System.out.print(array[i] + " ");
		}
		//f)Tim phan tu co gia tri x
		System.out.print("\nNhap vao gia tri can tim: ");
		int x=scanner.nextInt();
		int search=0;
		for (int i=0;i<n;i++) {
			if (array[i]==x) {
				System.out.print("Gia tri can tim co ton tai");
				search=1;
			}
		} if(search==0) System.out.print("Gia tri can tim khong ton tai trong mang");
	}
}
