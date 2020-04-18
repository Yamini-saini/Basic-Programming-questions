package basicPrograms;

import java.util.Scanner;

public class CountPerfectSq {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		System.out.println(squares(n,m));
		

	}
	static int squares(int a, int b) {
	       int i=0,j=0,f=0;
	       for(i =a;i<=b;i++){
	           if(perfectSquare(i)){
	               f=1;
	               break;
	           }
	       }
	       if(f==1){
	       double p =(double)i;
	       int strt = (int)Math.sqrt(p);
	       int min = (strt+1)*(strt+1);
	       if(b>=min){
	            for(j =b;j>=a;j--){
	              if(perfectSquare(j)){
	                  break;
	                }
	            }
	         double q =(double)j;
	         int end = (int)Math.sqrt(q);
	         return end-strt+1;
	       }
	       else{
	           return 1;
	       }
	       }
	       else{
	           return 0;
	       }

	    }
	static boolean perfectSquare(double sq){
	        double root = Math.sqrt(sq);
	        if((root-Math.floor(root))==0){
	            return true;
	        }
	        return false;
	    }

}
