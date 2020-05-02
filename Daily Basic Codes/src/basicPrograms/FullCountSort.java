package basicPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
  //GIVEN A PAIR OF AN INTEGER AND A STRING PRINT THE STRING IN OUTPUT FROMA SORTED LIST ACCORDING TO INTEGERS
//IF TWO STRINGS ARE ASSOCIATED WITH SAME INTEGER PRINT THEM IN THEIR ORIGINAL ORDER
//ALL THE STRINGS APPEARING IN FIRST HALF OF GIVEN INPUT SHOULD BE REPLACED WITH DASD=>"-"
// n size of list=> 2 to 1000000 only even,s size of each input string 1 to 10,x integer input =>0 to 99
public class FullCountSort {
//Sample input:20
//	0 ab
//	6 cd
//	0 ef
//	6 gh
//	4 ij
//	0 ab
//	6 cd
//	0 ef
//	6 gh
//	0 ij
//	4 that
//	3 be
//	0 to
//	1 be
//	5 question
//	1 or
//	2 not
//	4 is
//	2 to
//	4 the
    private static StringBuilder answer =  new StringBuilder();
    //USE STRINGBUILDER FOR FASTER OUPUT RATHER THAN SLOWER ITERATION EVERYTIME
	public static void main(String[] args) throws IOException {
		//USE BUFFEREDREADER FOR FASTER INPUT/OUTPUT
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        ArrayList<ArrayList<String>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add((ArrayList<String>) Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")));
        }

        countSort(arr);

        bufferedReader.close();

	}
	static void countSort(ArrayList<ArrayList<String>> arr) {
	    int[] count = new int[100];
	    int arrlist =0;
	    for(int i =0;i<arr.size();i++){
	      int a = Integer.parseInt(arr.get(i).get(0));
	      if(count[a]==0){
	        if(a>arrlist){
	            arrlist=a;
	        }
	        count[a]=1;
	      }
	    }
	     ArrayList<ArrayList<String>> ans = new ArrayList<>();
	     for(int j=0;j<=arrlist;j++){
	         ArrayList<String> temp = new ArrayList<>();
	         ans.add(temp);
	     }
	    for(int k=0;k<arr.size();k++){
	      ArrayList<String> base = arr.get(k);
	      int indx = Integer.parseInt(base.get(0));
	      if(k<arr.size()/2){
	          ans.get(indx).add("-");
	      }
	      else{
	      ans.get(indx).add(base.get(1));
	      }
	    }
	    for(int q=0;q<ans.size();q++){
	        if(!ans.get(q).isEmpty()){
	            for(int w = 0;w<ans.get(q).size();w++){
	                answer.append(ans.get(q).get(w)+" ");
	            }
	        }
	    }
	    System.out.println(answer);
	    }

}
