package algoritms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scn.nextInt();
		}
		//calling linear sort
		BubbleSorting(arr,0,arr.length-1);
		//Printing array
		for(int h=0;h<arr.length;h++) {
			System.out.print(arr[h]+" ");
		}
}
	public static void BubbleSorting(int[]arr,int si,int li) {
		//sorting in ascending order using recursion
		if(li==0) {
			//base case
			return;
		}
		if(si>=li) {
			si=0;
			li=li-1;
			BubbleSorting(arr,si,li);
		}
		else {	
		  if(arr[si]>arr[si+1]) {
			  //swapping elements
				int temp=arr[si];
				arr[si]=arr[si+1];
				arr[si+1]=temp;
				}
		  BubbleSorting(arr,si+1,li);
		}
	}
}
