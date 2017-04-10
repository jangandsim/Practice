import java.io.*;
import java.util.*;

public class p23 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int a = scan.nextInt();
    	char[][] b = new char[a][a];
    	scan.nextLine();
    	for(int i = 0; i < a; i++){
    		String c = scan.nextLine();
    		b[i] = c.toCharArray();
    	}
    	int max = 0;
    	for(int j = 0; j < a; j++){
    		for(int k = 0; k < a; k++){
    			if(b[j][k] == '.'){
    				int x = check(b,j,k);
    				if(x > max){
        				max = x;
        			}
    			}
    		}
    	}
    	System.out.println(max);
    }
    static int check(char[][] a, int n, int m){
    	int c = 1;
    	boolean check = true;
    	zz:
    	while(n - c >= 0 && n + c < a.length && m - c >= 0 && m + c < a.length){
    		for(int i = n-c; i <= n+c; i++){
    			for(int j = m-c; j <= m+c; j++){
    				if((n-i)*(n-i) + (m-j)*(m-j) <= c*c){
    					if(a[i][j] == '.'){
    						
    					} else {
    						break zz;
    					}
    				}
    			}
    		}
    		c++;
    	}
    	return c-1;
    }
}