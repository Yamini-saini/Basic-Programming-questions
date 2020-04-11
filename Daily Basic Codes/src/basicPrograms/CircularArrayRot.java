package basicPrograms;

import java.util.Scanner;

public class CircularArrayRot {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int size = sn.nextInt();
		int rotations = sn.nextInt();
		int queries = sn.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sn.nextInt();
		}
		int[] query = new int[queries];
		for(int j=0;j<query.length;j++) {
			query[j]=sn.nextInt();
		}
        int[] ans = circularArrayRotation(arr,rotations,query);
        for(int k=0;k<ans.length;k++) {
        	System.out.print(ans[k]+" ");
        }
	}
	static int[] circularArrayRotation(int[] a, int k, int[] queries) {
	      int[] aNew = new int[a.length];
	      int[] answer = new int[queries.length];
	      for(int i =0;i<a.length;i++){   
	        int add = k%a.length;
	        if((i+add)<a.length){
	          aNew[i+add]=a[i];
	        }
	        else{
	        aNew[i+add-a.length]=a[i];
	        }
	      }
	       for(int j=0;j<queries.length;j++){
	        answer[j]=aNew[queries[j]];
	       }
	       return answer;
	    }

}
