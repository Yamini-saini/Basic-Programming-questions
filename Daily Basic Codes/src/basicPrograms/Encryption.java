package basicPrograms;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	String str =scn.nextLine();
    System.out.println(encryption(str));
	}
	static String encryption(String s) {
		   s=s.replaceAll("\\s+", "");
	       double c = s.length();
	       int a = (int)Math.floor(Math.sqrt(c));
	       int b = (int)Math.ceil(Math.sqrt(c));
	       if((a*b)<s.length()){
	           a=a+1;
	       }
	       String ans ="";
	       for(int i=0;i<b;i++){
	         String str = "";
	         for(int j=i;j<s.length();j=j+b){
	             str=str+s.substring(j,j+1);
	         }
	       }
	       return ans;
	    }
}
