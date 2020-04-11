package basicPrograms;

import java.util.Scanner;

public class Ranking {

	public static void main(String[] args) {
	 //given a score table arranged in decreasing order find alice rank after each game when you are given her score for each game
	 //dense ranking is used: same marks same rank	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] scores = new int[n];
		for( int i=0;i<n;i++) {
			scores[i]=scn.nextInt();
		}
		int m = scn.nextInt();
		int[] alice = new int[m];
		for( int j=0;j<m;j++) {
			alice[j]=scn.nextInt();
		}
        int[] arr = climbingLeaderboard(scores,alice);
        for(int k=0;k<arr.length;k++) {
        	System.out.print(arr[k]+" ");
        }
	}
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
	     int[] rank = new int[scores.length];
	     int[] alicerank = new int[alice.length];
	     rank[0]=1;
	     for(int i =1;i<scores.length;i++){
	     if(scores[i]==scores[i-1]){
	       rank[i]=rank[i-1];
	     }
	     else{
	         rank[i]=rank[i-1]+1;
	     }
	     }
	     for(int j=0;j<alice.length;j++){
	        alicerank[j]=searchRank(alice[j],scores,rank);
	     }
	      return alicerank;
	    }
	    static int searchRank(int r,int[] scores,int[] rank){
	        int lo = 0 ;
	        int up= scores.length-1;
	        while(lo<=up) {
	        int mid= (lo+up)/2;
	        if (r>scores[mid]) {
	        up=mid-1;
	        }
	        else if(r<scores[mid]) {
	         lo=mid+1;}  
	        else {
	         return rank[mid];
	        }
	        }
	        if(lo==0&&up==-1){
	         return 1;
	        }
	        else if(lo==scores.length&&up==scores.length-1){
	         return (rank[rank.length-1]+1);
	        }
	        else{
	         return rank[lo];
	        }

	    }
}
