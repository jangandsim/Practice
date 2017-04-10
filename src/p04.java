import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class p04 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int xtot = 0;
        int ytot = 0;
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
        	int xtem = scan.nextInt();
        	x.add(xtem);
        	xtot+= xtem;
        }
        for(int j = 0; j < n; j++){
        	int ytem = scan.nextInt();
        	y.add(ytem);
        	ytot+= ytem;
        }
        if(ytot != xtot){
        	System.out.println(-1);
        } else {
        	ArrayList<Integer> temp = new ArrayList<Integer>();
        	for(int items : x){
        		if(y.contains(items)){
        			y.remove(new Integer(items));
        			temp.add(items);
        		}
        	}
        	for(int reit : temp){
        		x.remove(new Integer(reit));
        	}
        	for (int number : x) {
        		   System.out.println("Number = " + number);
            }
            Collections.sort(x);
            Collections.sort(y);
            long out = 0;
            for(int j = 0; j < x.size(); j++){
            	int ou2 = x.get(j) - y.get(j);
            	if(ou2 > 0){
            		out+= ou2;
            	}
            }
            System.out.println(out);
        }
    }
}