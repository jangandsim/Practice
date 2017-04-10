import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class p10 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int x = scan.nextInt();
    	int y = scan.nextInt();
    	int[][] grid = new int[x][y];
    	ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer[]> one = new ArrayList<Integer[]>();
    	for(int i = 0; i < x; i++){
    		for(int j = 0; j < y; j++){
    			int h = scan.nextInt();
    			grid[i][j] = h;
    			if(h == 1){
    				Integer[] k = {i,j};
    				one.add(k);
    			}
    		}
    	}
        
    }
}