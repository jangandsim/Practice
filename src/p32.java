import java.io.*;
import java.util.*;

public class p32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < a; i++){
        	String b = scan.nextLine();
        	int[] c = new int[b.length()-1];
        	for(int j = 0; j < b.length()-1; j++){
        		c[j] = Math.abs(b.charAt(j)-b.charAt(j+1));
        	}
        	boolean check = true;
        	for(int k = 0; k < (c.length/2)+1; k++){
        		if(c[k] != c[c.length-1-k]){
        			check = false;
        		}
        	}
        	if(check){
        		System.out.println("Funny");
        	} else {
        		System.out.println("Not Funny");
        	}
        }
    }
}