import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class p34 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        char[] numar = number.toCharArray();
        ArrayList<Integer> wrong = new ArrayList<>();
        for(int i = 0; i < n/2; i++){
        	if(numar[i] - numar[n-1-i]!= 0){
        		wrong.add(i);
        	}
        }
        int q = wrong.size();
        if(q > k){
        	System.out.println(-1);
        } else {
        	
        }
    }
}