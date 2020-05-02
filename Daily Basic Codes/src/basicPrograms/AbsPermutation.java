package basicPrograms;

import java.util.Scanner;

public class AbsPermutation {
//given an integer n and k, form an array of size n with 1 based indexing having minimum absolute permutation value, such that for all |pos[i]-i|= k 
//pos[i]	i	|Difference|	
//	3	    1	2
//	4	    2	2
//	1	    3	2
//	2	    4	2
//example: n =100 k =2 for position 3 we have 3-2=1and 3+2=5 then we should select minimum value i.e, 1	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int[] arr = absolutePermutation(n,k);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}
	static int[] absolutePermutation(int n, int k) {
	     int[] per = new int[n+1];
	     int[] arr ={0,-1};
	     boolean[] pos = new boolean[n+1];
	     for(int i =1;i<n+1;i++){
	         int a = i-k;
	         int b = i+k;
	         if(a<n+1&&a>0&&b<n+1){
	               if(!pos[a]&&!pos[b]){
	                 pos[a]=true;
	                  per[i]=a;
	                }
	                else if(!pos[a]){
	                   pos[a]=true;
	                   per[i]=a;  
	                }
	                else if(!pos[b]){
	                    pos[b]=true;
	                    per[i]=b;
	                }
	                else{
	                  return arr;
	                }
	            }
	            else if(a<n+1&&a>0){
	             if(!pos[a]){
	                  pos[a]=true;
	                  per[i]=a;  
	                }
	              else{
	                 return arr; 
	                }  
	            }
	           else if(b<n+1){
	               if(!pos[b]){
	                   pos[b]=true;
	                  per[i]=b;
	                }
	                else{
	                 return arr;
	                }   
	            }
	            else{
	              return arr;
	             }
	        }
	     return per;
	    }

}
