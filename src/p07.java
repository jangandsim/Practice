import java.io.*;
import java.util.*;

public class p07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int out = 0;
        for(int i = 0; i < n; i++){
        	a[i] = scan.nextInt();
        }
        for(int j = 0; j < n; j++){
        	b[j] = scan.nextInt();
        }
        for(int k : a){
        	for(int l: b){
        		if(k == l){
        			out++;
        		}
        	}
        }
        System.out.println(out);
    }
}