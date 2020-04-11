package basicPrograms;

import java.util.Scanner;

public class JumpingClouds {

	public static void main(String[] args) {
	 //start jumping a length k every time such that 1 unit energy is used to do so
	   //every time the place you land on is either 0 or 1,if you land on 1 ,energy decreases by 2
		//given an array of 0 and 1 , ini energy=100,k...find energy after the game ends i.e, you reach 1st element again
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
		  arr[i]=scn.nextInt();	
		}
		System.out.println(jumpingOnClouds(arr,k));
	}
	static int jumpingOnClouds(int[] c, int k) {
        int strt = (0+k)%c.length;
        int energy=100;
        while(strt!=0){
         energy=energy-1;
         if(c[strt]==1){
             energy=energy-2;
         }
         strt=(strt+k)%c.length;
        }
         energy=energy-1;
         if(c[strt]==1){
             energy=energy-2;
         }
         return energy;
    }

}
