package basicPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class ClosestNum {

	public static void main(String[] args) {
	// given an array of size n, find all the pairs of numbers having minimum absolute difference
	//10^-7<=array[i]<=10^7	, 2<=n<=200000
		  Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        int[] result = closestNumbers(arr);

	        for (int i = 0; i < result.length; i++) {
	        	System.out.print(String.valueOf(result[i])+" ");
	        }

	}
	static int[] closestNumbers(int[] arr) {
	    quickSort(arr,0,arr.length-1);
	    int min = Integer.MAX_VALUE;
	    ArrayList<Integer> ans = new ArrayList<>();
	    for(int i =0;i<arr.length-1;i++){
	        if(Math.abs(arr[i]-arr[i+1])<min){
	          min=Math.abs(arr[i]-arr[i+1]);
	        }
	    }
	     for(int i =0;i<arr.length-1;i++){
	        if(Math.abs(arr[i]-arr[i+1])==min){
	          ans.add(arr[i]);
	          ans.add(arr[i+1]);
	        }
	    }
	    int[] result = new int[ans.size()];
	    for(int j =0;j<ans.size();j++){
	        result[j]=ans.get(j);
	    }
	     return result;

	    }
	static void quickSort(int[] arr,int lo,int hi){
	       if(lo>=hi) {
	        return;
	      }
	    int pivot = arr[(lo+hi)/2];
	    int left =lo;int right =hi;
	    //1.Partitioning          
	    while(left<=right) {
	        while(arr[left]<pivot) {
	                left++;
	        }
	        while(arr[right]>pivot) {
	                right--;
	        }
	        if(left<=right) {
	        int temp = arr[left];
	        arr[left]=arr[right];
	        arr[right]=temp;
	        left++;
	        right--;
	    }
	    } 
	    //2. recursive calls for smaller problems
	    quickSort(arr,lo,right);
	    quickSort(arr,left,hi);
	    return; 
	    }

}
