package basicPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class UniformStringValue {
//GIVEN A STRING S : AND EACH ALPHABET WEIGHTS EXACTLY AT THE NO. IT COMES, FIND IF A GIVEN QUERY VALUE IS ONE OF THE VALUES OF A
// UNIFORM SUBSTRINGS OF S ...EX: aaabbcc substring are a,aa,aaa,b,bb,c,cc...values of which are aa=a+a=1+1=2.
//constraints query array 10^7 and string contains only lower case ascii characters
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	String s = scn.next();
	int n = scn.nextInt();
	int[] queries = new int[n];
	for(int i=0;i<n;i++) {
		queries[i]=scn.nextInt();
	}
	String[] ans = weightedUniformStrings(s,queries);
	for(String j:ans) {
	 System.out.println(j);	
	}

	}
	static String[] weightedUniformStrings(String s, int[] queries) {
        HashSet<Integer> weights = new HashSet<>();
        String[] ans = new String[queries.length];
        int count=1;
        int value=0;
        char pre = '-';
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==pre){
               count++;
            }
            else{
                pre=s.charAt(i);
                count=1;   
            }
             value = (s.charAt(i)-96);
             weights.add(value*count);
        }

         for(int k=0;k<queries.length;k++){
            if(weights.contains(queries[k])){
                  ans[k]="Yes";
            }
            else{
                 ans[k]="No";
            }
        }
        return ans;
    }

}
