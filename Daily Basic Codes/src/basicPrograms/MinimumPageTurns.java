package basicPrograms;

import java.io.*;
import java.util.Scanner;

public class MinimumPageTurns {


   public static int pageCount(int n, int p) {
      int front=0,back=0;
      for(int i=1;i<n;i++){
          if(i==1){
              if(p==i){
              break;
              }
              else{
              front = front+1;
              }
          }
          else{
              if(p==i||p==i+1){
              break;
              }
              else{
              i=i+1;
              front=front+1;
              }
          }
        }
        for(int i=n;i>1;i--){
            if(i%2==0){
                 if(p==i){
                 break;
                 }
                 else{
                 back=back+1;
                 }
            }
            else{
                 if(p==i||p==i-1){
                 break; 
                 }
                 else{
                 i=i-1;
                 back=back+1;
                }
            }
        }
        if(front>back){
            return back;
        }
        else{
            return front;
        }
    }

    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int result = pageCount(n, p);
        System.out.println(result);
        scanner.close();
    }
}

