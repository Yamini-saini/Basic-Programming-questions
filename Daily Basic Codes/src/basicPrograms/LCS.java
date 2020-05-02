package basicPrograms;

import java.util.Scanner;

public class LCS {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2= scn.next();
		System.out.println(commonChild(s1,s2));

	}
	static int commonChild(String s1, String s2) {
	       //Famous DP problem LCS(LARGEST COMMON SUBSEQUENCE) 
	       int[][] matrix= new int[s1.length()+1][s2.length()+1];
	       matrix[s1.length()][s2.length()]=0;
	       for(int i =s1.length();i>=0;i--) {
	           for(int j=s2.length();j>=0;j--) {
	               if(i==s1.length()||j==s2.length()) {
	                   matrix[i][j]=0;
	                   continue;
	               }
	               if(s1.charAt(i)==s2.charAt(j)) {
	                   matrix[i][j]=1+matrix[i+1][j+1];
	                   //Add one to previous diagonal element
	               }
	               else {
	                       matrix[i][j]=Math.max(matrix[i+1][j], matrix[i][j+1]);
	                       //insert maximum among the immediate side and down element
	               }
	           }
	       }
	       return matrix[0][0];
	    }
}
