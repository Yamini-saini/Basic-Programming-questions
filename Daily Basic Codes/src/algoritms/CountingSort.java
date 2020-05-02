package algoritms;

import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		countingSort(arr);
}
    public static void countingSort(int[]arr) {
    	int max =0;
    	for(int i =0;i<arr.length;i++) {
    		if(arr[i]>max) {
    			max=arr[i];
    		}
    	}
    	int[] count = new int[max+1];
    	for(int j=0;j<arr.length;j++) {
    		count[arr[j]]=count[arr[j]]+1;
    	}
    	int k =0;
    	for(int i=0;i<count.length;i++) {
    		if(count[i]!=0) {
    			for(int j=1;j<=count[i];j++) {
    				arr[k]=i;
    				k+=1;
    			}
    		}
    	}
    	for(int y=0;y<arr.length;y++) {
    		System.out.print(arr[y]+" ");
    	}
    }
}
