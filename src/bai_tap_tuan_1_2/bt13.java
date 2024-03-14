package bai_tap_tuan_1_2;

import java.util.Scanner;

public class bt13 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhap vao so hang cua ma tran:");
	int n=scanner.nextInt();
	System.out.print("Nhap vao so cot cua ma tran:");
	int m=scanner.nextInt();
	
	int[][] matrix= new int[n][m];
	System.out.println("Nhap vao cac phan tu cua ma tran: ");
	inputMatrix(matrix,scanner);
	
	System.out.println("Ma tran vua nhap la: ");
	printMatrix(matrix);
	}
	public static void inputMatrix (int[][] matrix,Scanner scanner) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print("Nhap vao phan tu [" + (i+1) + "][" + (j+1) + "] :");
				matrix[i][j]=scanner.nextInt();
			}
		}
	}
	public static void printMatrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
