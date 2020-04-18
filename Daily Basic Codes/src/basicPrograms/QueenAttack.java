package basicPrograms;

import java.util.Scanner;

public class QueenAttack {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int q =  scn.nextInt();
		int x = scn.nextInt();
		int y = scn.nextInt();
		int[][] obstacles = new int[q][2];
		for(int i =0;i<q;i++) {
			obstacles[q][0]=scn.nextInt();
			obstacles[q][1]=scn.nextInt();
		}
		System.out.println(queensAttack(n,q,x,y,obstacles));

	}
	static int queensAttack(int n, int q, int x, int y, int[][] obstacles) {
        int d11, d12, d21, d22, r1, r2, c1, c2; 
        d11 = Math.min( x-1, y-1 ); 
        d12 = Math.min( n-x, n-y ); 
        d21 = Math.min( n-x, y-1 ); 
        d22 = Math.min( x-1, n-y ); 
      
        r1 = y-1; 
        r2 = n-y; 
        c1 = x-1; 
        c2 = n-x; 

        for (int k = 0; k<q; k++) 
        { 
            if ( x > obstacles[k][0] && y > obstacles[k][1] && 
                    x-obstacles[k][0] == y-obstacles[k][1] ) 
                d11 = Math.min(d11, x-obstacles[k][0]-1); 
      
            if ( obstacles[k][0] > x && obstacles[k][1] > y && 
                    obstacles[k][0]-x == obstacles[k][1]-y ) 
                d12 = Math.min( d12, obstacles[k][0]-x-1); 
      
            if ( obstacles[k][0] > x && y > obstacles[k][1] && 
                    obstacles[k][0]-x == y-obstacles[k][1] ) 
                d21 = Math.min(d21, obstacles[k][0]-x-1); 
      
            if ( x > obstacles[k][0] && obstacles[k][1]  > y && 
                        x-obstacles[k][0] == obstacles[k][1]-y ) 
                d22 = Math.min(d22, x-obstacles[k][0]-1); 
      
            if ( x == obstacles[k][0] && obstacles[k][1] < y ) 
                r1 = Math.min(r1, y-obstacles[k][1]-1); 
      
            if ( x == obstacles[k][0] && obstacles[k][1] > y ) 
                r2 = Math.min(r2, obstacles[k][1]-y-1); 
      
            if ( y == obstacles[k][1] && obstacles[k][0] < x ) 
                c1 = Math.min(c1, x-obstacles[k][0]-1); 
      
            if ( y == obstacles[k][1] && obstacles[k][0] > x ) 
                c2 = Math.min(c2, obstacles[k][0]-x-1); 
        } 
      
        return d11 + d12 + d21 + d22 + r1 + r2 + c1 + c2; 
      
    }
}
