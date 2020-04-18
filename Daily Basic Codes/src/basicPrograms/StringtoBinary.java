package basicPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class StringtoBinary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		String[] topic = new String[n];
		for(int i=0;i<n;i++) {
			//all string with length m
			topic[i] = scn.next();
		}
		int[] arr= acmTeam(topic);
		System.out.println(arr[0]);
		System.out.println(arr[1]);

	}
	 static int[] acmTeam(String[] topic) {
	        int n = topic.length;
	            BigInteger[] bi = new BigInteger[n];

	            for (int i = 0; i < n; i++)
	                bi[i] = new BigInteger(topic[i], 2);

	            int max = 0;
	            int Count = 0;

	            for (int i = 0; i < n; i++) {
	                for (int j = i + 1; j < n; j++) {
	                    BigInteger iuj = bi[i].or(bi[j]);
	                    int bitCount = iuj.bitCount();
	                    if (bitCount > max) {
	                        max = bitCount;
	                        Count = 1;
	                    } else if (bitCount == max) {
	                        Count++;
	                    }
	                }
	            }

	            int result[] = { max, Count };
	            return result;
	    }
}
