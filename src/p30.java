import java.io.*;
import java.util.*;

public class p30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < a; i++){
        	String b = scan.nextLine();
        	StringBuilder c = new StringBuilder(b);
        	char d = c.charAt(0);
        	int n = 1;
        	while (n < c.length()){
        		if(d == c.charAt(n)){
        			c.deleteCharAt(n);
        		} else {
        			d = c.charAt(n);
        			n++;
        		}
        	}
        	System.out.println(b.length()-n);
        }
    }
}