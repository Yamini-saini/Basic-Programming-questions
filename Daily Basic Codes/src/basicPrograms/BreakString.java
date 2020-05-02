package basicPrograms;

import java.util.Scanner;
//let there be q queries,where each query is a string of character not more than 32,break the string into a string of increasing
//numbers by one ,if possible print YES with the starting number with space otherwise NO
//EXAMPLE => "1234" - 1,2,3,4 O/P = YES 1,"10203"-1,02,03 will not be considered (no preceding zeroes should be present) o/p-NO
public class BreakString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i =0;i<q;i++) {
			separateNumbers(scan.next());
		}

	}
	static void separateNumbers(String s) {
	      boolean valid = false;
	        long num = -1;
	        // Try each possible starting number
	        for (int i=1; i<=s.length()/2; ++i) {
	            long x = Long.parseLong(s.substring(0,i));
	            num = x;
	           // Build up sequence starting with this number
	            String temp = Long.toString(x);
	            while (temp.length() < s.length()) {
	                temp += Long.toString(++x);
	            }
	            // Compare to original
	            if (temp.equals(s)) {
	                valid = true;
	                break;
	            }
	        }
	        System.out.println(valid ? "YES " + num : "NO");
	    }
}
