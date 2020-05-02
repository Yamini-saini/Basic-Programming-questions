package basicPrograms;

import java.util.Scanner;

public class StringSeq {

	public static void main(String[] args) {
		// SEARCH IF A GIVEN SEQUENCE OF STRING CAN FORM WORD HACKERRANK
		//EX: HAACCKERRANKK CAN WHEREAS HCCAAKERRANKK CANNOT
       Scanner scn = new Scanner(System.in);
       String s = scn.next();
       scn.close();
       System.out.println(hackerrankInString(s));
	}
	static String hackerrankInString(String s) {
	    char[] word = {'h','a','c','k','e','r','r','a','n','k'};
	    int ini =0;
	    for(int i =0;i<word.length;i++){
	        char ch = word[i];
	        int f =0;
	        for(int j =ini;j<=(i+s.length()-10);j++){
	          if(ch==s.charAt(j)){
	              ini=j+1;
	              f=1;
	              break;
	          }
	        }
	        if(f==0){
	            return "NO";
	        }
	    }
	      return "YES";
	    }
}
