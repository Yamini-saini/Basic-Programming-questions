package basicPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MaxDist {
    // there are n cities connected not in a cyclic way
	// an array c contains cities with space station
	//find max distance b/w a city and space station when at least one city contains a space station
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m=scn.nextInt();
		int[] c = new int[m];
		for(int i=0;i<m;i++) {
		 c[i]=scn.nextInt();	
		}
        System.out.println(flatlandSpaceStations(n,c));
	}
	static int flatlandSpaceStations(int n, int[] c) {
	     Arrays.sort(c);
	     int maxDistance = c[0];
	     for(int i = 1; i < c.length; i++){
	        int distance = (c[i] - c[i-1]) / 2;
	        if(maxDistance < distance) maxDistance = distance;
	      }
	      int lastGap = (n-1) - c[c.length - 1];
	      return (lastGap < maxDistance) ? maxDistance : lastGap;
	    }
}
