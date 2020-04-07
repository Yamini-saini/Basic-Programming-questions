package section3;

import java.util.Scanner;

public class Anybasetodecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int srcno = scn.nextInt();
		int srcb= scn.nextInt();
		int dstno = anybaseToDecimal(srcno,srcb);
		System.out.println(dstno);
		

	}
	public static int anybaseToDecimal(int srcno,int srcb) {
		
     int j=1;
	 int ans = 0;
	 while(srcno != 0) {
	   int r=srcno%10;
		ans=ans+r*j;
		j=j*srcb;
		srcno=srcno/10;
		}
		
	return ans;
	}
	

}
