package basicPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		// Given a string s can you form a palindrome from it !!
		Scanner c = new Scanner(System.in);
		String str = c.next();
		System.out.println(gameOfThrones(str));
		

	}
	static String gameOfThrones(String s) {
		//if length is odd only pairs should be present
		//if length is even only one single element other than pairs should be present
	     int n =s.length()%2,c=0;   
	     HashMap<Character,Integer> map =  new HashMap<>();
	     for(int i =0;i<s.length();i++){
	         if(!map.containsKey(s.charAt(i))){
	           map.put(s.charAt(i),1);
	         }
	         else{
	           int ov = map.get(s.charAt(i));
	           map.put(s.charAt(i),ov+1);  
	         }
	     }
	     Collection<Integer> values = map.values();
	     for(Integer value:values){
	         if(n==0&&(value%2!=0)){
	             return "NO";
	         }
	         else if(n==1){
	           if(value%2!=0&&c==0){
	             c=1;
	           }
	           else if(value%2!=0&&c==1){
	               return "NO";
	           }
	         }
	     }
	      return "YES";
	    }
}
