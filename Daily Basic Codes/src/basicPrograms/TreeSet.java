package basicPrograms;

import java.util.HashSet;
import java.util.SortedSet;

public class TreeSet {

	public static void main(String[] args) {
	int n =7;
	int a=9,b=11;
	int[] arr = stones(n,a,b);
	for(int i =0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}

	}
	static int[] stones(int n, int a, int b) {
	       HashSet<Integer> set = values(n-1,a,b); 
	       int[] ans = new int[set.size()];
	       int i =0;
	       for(Integer value:set){
	           ans[i]=value;
	           i++;
	       }
	       return ans;

	    }
	    
		
  private static HashSet<Integer> values(int n,int a ,int b){
	        if(n==1){
	           HashSet<Integer> base = new HashSet<>();
	           base.add(a);
	           base.add(b);
	           return base;
	        }
	       HashSet<Integer> rr = values(n-1,a,b);
	       HashSet<Integer> mr = new HashSet<>();
	       for(Integer i : rr){
	           mr.add((i+a));
	           mr.add((i+b));
	       }
	       return mr;
	    }
}
