package basicPrograms;

import java.util.Scanner;
import java.util.Stack;

public class CountingValleys {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	String str = scn.nextLine();
	//n is the length of string 
	//String str is made of U and D characters such that 
	//UD TOEGTHER IS MOUNTAIN AND DU together is valley
	 System.out.println(countingValleys(n,str));
    //prints the total no of valleys traveled in a string given!
	}
	static int countingValleys(int n, String s) {
        Stack<Character> stack = new Stack<>();
        int mount=0,upCount=0;
        int ans=0;
        for( int i=0;i<s.length();i++){
         if(stack.isEmpty()){
             if(s.charAt(i)=='U'){
                 upCount=upCount+1;
                }
             else{
                 if(upCount==0){
                     stack.push(s.charAt(i));
                    }
                  else{
                      upCount=upCount-1;
                    }
                }
            }
         else{
             if(s.charAt(i)=='U'){
                 mount=mount+1;
                 if(mount==stack.size()&&stack.size()>0){
                     while(stack.isEmpty()){
                         stack.pop();
                         mount=mount-1;
                         }
                     ans=ans+1;
                    }
                
                }
             else{
                 if(mount==0){
                     stack.push(s.charAt(i));
                    }
                  else{
                      mount=mount-1;
                    }
                }
            }
        }
        return ans;
    }


}
