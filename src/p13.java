import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class p13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n = 3;
        int k = 1;
        while(t < k){
        	k = 2*k + 2;
        }
        System.out.println(k);
    }
}
