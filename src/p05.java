import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class p05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> loca = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> group = new ArrayList<ArrayList<Integer>>();
        int out = 1;
        for(int i = 0; i < n; i++){
           int temp = scan.nextInt();
           ArrayList<Integer> each = new ArrayList<Integer>();
           if(temp == -1){
              loca.add(i);
           } else {
              each.add(temp);
           }
           group.add(each);
        }
        for(int z : loca){
           ArrayList a = group.get(z);
           for(int k = 1; k < z; k++){
              if(z%k == 0){   
                 ArrayList b = group.get(k);
                 for(int y : b){
                    
                 }
              }
           }
        }
    }
