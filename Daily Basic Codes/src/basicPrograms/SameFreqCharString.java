package basicPrograms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class SameFreqCharString {
   // a string is said valid if all the character occur same no of times in a string for by removing any one character , freq
	//of characters becomes same, Given a string(=length<=10^5) find if it valid;
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 String s = scn.next();
         System.out.println(s);
	}
	static String isValid(String s) {
	 int[] arr =  new int[26];
	 HashMap<Integer,Integer> map = new HashMap<>();
	 //count no of times a character occur in string
	     for(int i =0;i<s.length();i++){
	        arr[s.charAt(i)-97]++;
	     }
	 //add unique frequencies and no of characters which its occurs for ...example "aaabbccd"  3=>1,2=>2,1=>1  
	     for(int i =0;i<26;i++){
	        if(arr[i]!=0){
	            if(map.containsKey(arr[i])){
	              int ov = map.get(arr[i]);
	              map.put(arr[i],ov+1);
	            }
	            else{
	                map.put(arr[i],1);
	            }
	        }
	     }
	 //if map.size>2 its mean more than 2 diiferent frequencies occur    
	      if(map.size()>2){
	        return "NO";
	       } 
	      else if(map.size()==2){
	        int k1=0,k2=0;
	        Set<Integer> keys = map.keySet();
	        for(Integer key:keys){
	            if(k1==0){
	                k1=key;
	            }
	            else{
	                k2=key;
	            }
	        } 
	 //case 1 => "aaabbbc"       
	        if(k1==1&&map.get(k1)==1){
	            return "YES";
	        }
	        else if(k2==1&&map.get(k2)==1){
	            return "YES";
	        }
	 //case 2=> "aaabbbbb"       
	        else if(Math.abs(k1-k2)!=1){
	            return "NO";
	        }
	 //case 3=> "aabbccc"       
	        else{
	          int k = Math.max(k1,k2);
	          if(map.get(k)!=1){
	              return "NO";
	          }
	        }
	      }
	       return "YES";
	    }
}
