package algoritms;

import java.util.Scanner;

public class LinearSort {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scn.nextInt();
		}
		//calling linear sort
		LinearSorting(arr);
		//Printing array
		for(int h=0;h<arr.length;h++) {
			System.out.print(arr[h]+" ");
		}
		
	}
	public static void LinearSorting(int[] arr) {
		//sorting in ascending order
		//> to < in line 20 for descending order
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
			   if(arr[i]>arr[j]) {
				   //Swap elements
				   int temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }	
			}
		}
	}
}
