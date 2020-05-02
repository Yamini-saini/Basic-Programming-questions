package basicPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionString {
  //Given an array of string return the maximum characters common in all the string present in array
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    //LENGTH OF ARRAY IS T;
	    Set<Character> set = convertToSet(scan.next());
	    for(int i=1; i<t ;i++){
	       set.retainAll(convertToSet(scan.next()));    //RETAINALL FUNCTION OF SET
	    }
	    System.out.print(set.size());
	}
	public static Set<Character> convertToSet(String s) {
	Set<Character> set = new HashSet<Character>(26);
	for (char c : s.toCharArray())
	    set.add(Character.valueOf(c));
	return set;
	}

	
	//ANOTHER CODE:
//	 static int intersection(String[] arr) {
//	     int n =arr.length;char c= 'a';int[] a = new int[26];
//	        int count =0;
//	        for(int i =0; i< n; i++){
//	            String s = arr[i];
//	            for(int j=0; j<s.length(); j++)
//	                if(a[s.charAt(j)%c] == i)
//	                    a[s.charAt(j)%c]++;
//	        }
//	        for(int i =0; i<26 ; i++)
//	            if(a[i] == n) count++;
//	        return count;
//	    }   
	    
}
