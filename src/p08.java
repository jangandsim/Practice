import java.io.*;
import java.util.*;

public class p08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
        	int m = scan.nextInt();
        	int sum = 0;
        	ArrayList<Integer> z = new ArrayList<>();
        	for(int j = 0; j < m; j++){
        		int k = scan.nextInt();
        		sum += k;
        		z.add(k);
        	}
        	System.out.println(lowers(z, sum));
        }
    }
    public static int lowers(ArrayList<Integer> c, int d){
    	ArrayList<Integer> x = new ArrayList<>();
    	ArrayList<Integer> y = new ArrayList<>();
    	int l = 0;
    	int w = 0;
    	while(l <= d){
    		int p = c.get(w);
    		x.add(p);
    		l+=p;
    		if(l==d){
    			;
    		} 
    		w++;
    	}
		return 0;
    }
}