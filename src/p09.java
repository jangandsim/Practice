import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class p09 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tot = 0;
        int count = 0;
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int a_i=0; a_i < n; a_i++){
            int temp = in.nextInt();
            b.add(temp);
            tot += temp;
        }
        Collections.sort(b);
        int c = b.get(b.size()-1);
        while(c >= (tot - c)){
        	count++;
        	b.remove(b.size()-1);
        	if(c%2 == 1){
        		b.add(c/2);
        		b.add((c/2) +1);
        	} else{
        		b.add(c/2);
        		b.add(c/2);
        	}
        	Collections.sort(b);
            c = b.get(b.size()-1);
        }
        System.out.println(count);             
    }
}