import java.util.*;
 
 
public class Solution {
    
    public static void main(String[] args){
      
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] t = new int[3];
      
          for(int i = 0 ; i<n ; i++){
             t[i%3] += in.nextInt();
          }
      
           int max = Math.max(t[0] , t[1]), t[2]);
           if(max == t[0]) System.out.println("chest");
           else if(max == t[1]) System.out.println("biceps");
           else System.out.println("back");
    }    
}
