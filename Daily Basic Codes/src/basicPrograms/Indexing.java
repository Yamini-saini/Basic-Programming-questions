package basicPrograms;

import java.util.Scanner;

public class Indexing {

	public static void main(String[] args) {
		//Given an array of size n, where an element 1<=p(x)<=n for all 1<=x<=n i.e, p(1),p(2)...
		//find an array y such that p(p(y))=x
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
		  arr[i]=scn.nextInt();	
		}
        int[] ans=permutationEquation(arr);
        for(int j=0;j<ans.length;j++) {
    	   System.out.print(ans[j]+" ");
        }
	}
	static int[] permutationEquation(int[] p) {
	     int[] index = new int[p.length];
	     //forming an array where an element p(x) is found at p(x)-1 index
	     for(int i =0 ;i<p.length;i++ ){
	         index[p[i]-1]=i;
	     }
	     int[] y = new int[p.length];
	     //array where an element 1<=y<=n is found at p(p(y))+1
	     for(int j=0;j<y.length;j++){
	         y[j]=index[index[j]]+1;
	     }
	     return y;
	    }
}
