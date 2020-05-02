package algoritms;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		insertionSort(arr);

	}
	public static void insertionSort(int[] arr) {
		for(int i =1;i<arr.length;i++) {
			int value = arr[i];
			int j =i-1;
			while(j>=0&&arr[j]>value) {
				arr[j+1]=arr[j];
				j-=1;
			}
			arr[j+1]=value;
		}
		for(int k =0;k<arr.length;k++) {
			System.out.println(arr[k]+" ");
		}
	}

}
