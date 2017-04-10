import java.io.*;
import java.util.*;

public class p26{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tot = scan.nextInt();
        int[] p = new int[tot+1];
        int[] q = new int[tot+1];
        p[0] = 0;
        q[0] = 0;
        p[1] = 0;
        q[1] = 0;
        for(int i = 2; i < tot+1; i++){
        	q[i] = scan.nextInt();
            p[i] = p[q[i]]+1;
        }
        
        int testcases = scan.nextInt();
        for(int j = 0; j < testcases; j++){
        	int u = scan.nextInt();
        	int v = scan.nextInt();
        	int out = (p[v]-p[u])*(p[v]-p[u]);
        	ArrayList<Integer> z = new ArrayList<>();
        	z.add(v);
        	for(int l = v+1; l < p.length; l++){
        		if(z.contains(q[l])){
        			z.add(l);
        			out += (p[l]-p[u])*(p[l]-p[u]);
        		}
        		
        	}
    		System.out.println(out);
        }
    }
}