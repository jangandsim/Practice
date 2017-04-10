import java.io.*;
import java.util.*;

public class p15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int candy = n;
        int[][] table = new int[n][2];
        for(int i = 0; i < n; i++){
        	table[i][0] = scan.nextInt();
        	table[i][1] = 1;
        }
        boolean still = true;
    	while(still){
    		still = false;
    		for(int j = 0; j < n; j++){
    			if(j > 0 && table[j][0]> table[j-1][0] && table[j][1] < table[j-1][1]){
    				table[j][1] = table[j-1][1] +1;
    				candy++;
    			}
    			if(j < n-1 && table[j][0]> table[j+1][0] && table[j][1] < table[j+1][1]){
    				table[j][1] = table[j+1][1] +1;
    				candy++;
    			}
    		}
    	}
    	
    }
}