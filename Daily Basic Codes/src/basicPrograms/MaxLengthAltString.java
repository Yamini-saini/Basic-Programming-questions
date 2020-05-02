package basicPrograms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MaxLengthAltString {
    //GIVEN A STRING S FIND THE MAXIMUM LENGTH OF ALTERNATING STRING THAT CAN BE OBTAINED BY REMOVING ALL OTHER CHARACTERS FROM THE STRING
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 String s = scn.next();
	 System.out.print(alternate(s));

	}
	static int alternate(String s) {
	 HashMap<Character,Integer> map = new HashMap<>();
	 int max=0;
	    //Get all unique characters in string along with their no of occurrences
	    for(int i =0;i<s.length();i++){
	        if(map.containsKey(s.charAt(i))){
	         int ov = map.get(s.charAt(i));
	         map.put(s.charAt(i),ov+1);
	        }
	        else{
	            map.put(s.charAt(i),1);
	        }
	    }
	    //Form an array of unique character called as key
	     Set<Character> keys = map.keySet();
	     char[] key = new char[keys.size()];
	     int o=0;
	      for(Character w:keys) {
	           key[o]=w;
	           o++;
	       }
	     //Access only those pair of characters from key which can somehow form alternating string 
	     for(int j=0;j<key.length-1;j++){ 
	        for(int k =j+1;k<key.length;k++){ 
	          //CASE1 char1 = 2,char2=2 ...example papa	  
	          if(map.get(key[j])==map.get(key[k])){
	             int a  = checkAlternate(key[j],key[k],s);
	             if(a>max){
	               max=a;
	               }
	           }
	             //Case2 example...atata       
	           else if((map.get(key[j])+1==map.get(key[k]))||(map.get(key[j])-1==map.get(key[k]))){
	               int b  = checkAlternate(key[j],key[k],s);
	                if(b>max){
	                    max=b;
	                 }
	            }
	        }
	      }
	     //return maximum length among all alternating strings found
	  return max;
   }

    static int checkAlternate(char c1,char c2,String s){
	  String str =s;
	  int count1=0,count2=0;
	      for(int i =0;i<s.length();i++){
	          if(s.charAt(i)!=c1&&s.charAt(i)!=c2){
	           str = str.replace(s.substring(i,i+1),"");
	           //replacing all traces of character in resultant string
	          }
	          else if(s.charAt(i)==c1&&count1==0){
	              count1=1;
	              count2=0;
	          }
	          else if(s.charAt(i)==c2&&count2==0){
	              count2=1;
	              count1=0;
	          }
	          else{
	        	  //returns -1 if no alternating string is found example...babba
	              return -1;
	          }
	       }
	   return str.length();
	  }

}
