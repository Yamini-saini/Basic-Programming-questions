package basicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HappyLady {
  //A ladybug is happy only when its left or right adjacent cell is occupied by another lady bug having the same color.
	//In a single move, you can move a ladybug from its current position to any empty cell.
	// STRING CONTAINS ONLY ASCII CHAR(A-Z OR_)
	//RETURN YES IF YOU CAN MAKE LADYBUG HAPPY and NO OTHERWISE
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String b = scn.next();
		System.out.println(happyLadybugs(b));

	}
	static String happyLadybugs(String b) {
	     HashMap<Character,Integer> map = new HashMap<>();
	     for(int i =0;i<b.length();i++){
	        if(map.containsKey(b.charAt(i))){
	            int ov = map.get(b.charAt(i));
	            map.put(b.charAt(i),ov+1);
	        } 
	        else{
	            map.put(b.charAt(i),1);
	        }
	     }
	     int ucount =0;
	     Set<Map.Entry<Character, Integer>> mm = map.entrySet();
	      for(Map.Entry<Character, Integer> m:mm){ 
	         if(m.getKey()!='_'&&m.getValue()==1){
	             return "NO";
	         }
	         else if(m.getKey()=='_'){
	           ucount = m.getValue();
	         }
	        }  
	        if(ucount!=0){
	            return "YES";
	        }
	        else{
	            int count=0;
	            for(int j=0;j<b.length()-1;j++){
	                if(b.charAt(j)==b.charAt(j+1)){
	                    count=count+1;
	                }
	                else{
	                    if(count!=0){
	                        count=0;
	                    }
	                    else{
	                        return "NO";
	                    }
	                }
	            }
	           return "YES";
	        }

	    }
}
