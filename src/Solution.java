import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   //n is number of elements in array
        int k = in.nextInt();   //k is number of rotations
        int [] oldArray = new int[n];
        
        for(int i=0; i < n; i++){
            oldArray[i] = in.nextInt();
        } 
         
        int[] newArray = new int[n];
        
        for (int j=0; j<k; j++){
        
            for(int i=0; i<n-1; i++){
                newArray[i]= oldArray[i+1];
            }
                newArray[n] = oldArray[0];
        
            }
            System.out.println(newArray);
            
            
        }
    }
