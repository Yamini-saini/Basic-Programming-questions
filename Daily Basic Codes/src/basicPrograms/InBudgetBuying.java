package basicPrograms;

import java.util.Scanner;

public class InBudgetBuying {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int key = scn.nextInt();
		int dri = scn.nextInt();
		int[] keyboards = new int[key];
		int[] drives  = new int[dri];
		System.out.println(getMoneySpent(keyboards,drives,b));
		//Print the max. expenditure to buy only one keyboard and drive within a budget d 

	}
	 static int getmax(int i , int[] arr , int b){
	        int max = 0;
	        for( int j=0;j<arr.length;j++){
	            if((i+arr[j])<=b&&(i+arr[j])>max){
	             max=arr[j]+i;
	            }
	        }
	        return max;
	    }
	    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
	        int max=0;
	        for( int i=0;i<keyboards.length;i++){
	        int a = getmax(keyboards[i],drives,b);
	        if(a>max){
	         max=a;
	        }
	        }
	        if(max==0){
	            return -1;
	        }
	        else {
	            return max;
	        }
	    }
}
