import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class p22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = (a-1)/3+1;
        int c = 0;
        while(b>0){
        	c++;
        	b /=2;
        }
        
        int d = c;
        int e = 0;
        while(--d > 0){
        	e = e*2 + 1;
        }
        e = e*3 + 1;
        int f = a-e;
        int n = (int) Math.pow(2, c-1)*3 -f;
        System.out.println(n);
    }
}
