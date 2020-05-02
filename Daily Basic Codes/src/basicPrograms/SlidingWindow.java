package basicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
  //given a string of length n such T n%4 is always 0,and string is made of only 4 distinct characters.A steady string is one in which
//all the 4 characters are present in same number,find the minimum length of substring in s so as to make it a steady substring
public class SlidingWindow {
  //SLIDING WINDOW AND TWO POINTER APPORACH TO FING MINIMUM LENGTH SUBSTRING FOR REPLACEMENT
	public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       String s = scn.next();
       System.out.println(Get(n,s));
       System.out.println(Solve(n,s));

	}
	//balanced function to check if it is steady or not
	public static boolean balanced(int N, Map<Character, Integer> map) {
	    if (map.get('A') <= N && map.get('C') <= N && map.get('G') <= N
	            && map.get('T') <= N)
	        return true;

	    return false;
	}

	public static int Solve(int N, String s) {
		//SLIDING WINDOW COMBINES WITH TWO POINTER APPROACH
	    Map<Character, Integer> map = new HashMap<Character, Integer>();
	    map.put('A', 0);
	    map.put('C', 0);
	    map.put('G', 0);
	    map.put('T', 0);

	    for (int i = 0; i < s.length(); ++i) {
	        map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
	    }

	    int min = Integer.MAX_VALUE;

	    int i = 0;
	    int j = 0;

	    while (i < s.length() && j < s.length()) {
	        if (!balanced(N, map)) {
	            map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
	            //System.out.println(map);
	            j++;
	        } else {
	            min = Math.min(min, j - i);
	            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
	            //System.out.println(map);
	            i++;
	        }
	    }

	    return min;
	}
	public static int Get(int n,String s) {
		Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 0);
        map.put('G', 0);
        map.put('T', 0);
        for (Character c : s.toCharArray())
            map.put(c, map.get(c) + 1);

        int left = 0, right = 0, min = Integer.MAX_VALUE;
        while(right < n){
            char rc = s.charAt(right++);
            map.put(rc, map.get(rc) - 1);
            while(balanced(n,map)&&left<n){
                min = Math.min(min, right - left);
                char lc = s.charAt(left++);
                map.put(lc, map.get(lc) + 1);
            }
        }
        return min;
    }
		
}

