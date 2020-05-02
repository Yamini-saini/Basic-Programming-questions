package basicPrograms;

import java.util.Scanner;

public class Counter {
//	Bob has a strange counter. At the first second, it displays the number 3 . Each second, the number displayed by the counter decrements by 1 until it reaches 1 .
//	The counter counts down in cycles. In next second, the timer resets to 2*initial displayed number and continues counting down counting
	// 1 3 => updates to  4 12
	// 2 2                5 11
	// 3 1                6 10 and so on... given a time in second determine counter's value...t can be up to 10^12
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long time =  in.nextLong();
		System.out.println(strangeCounter(time));

	}
	static long strangeCounter(long t) {
	     long value =0;
	     long ans =0;
	     for(long i =3;i<Long.MAX_VALUE;i=i*2){
	      value=value+i;
	      if(t==value){
	        return 1;
	      }
	      else if(t<value){
	          ans=value-t;
	          ans=ans+1;
	          break;
	      }
	     }
	     return ans;
	    }
}
