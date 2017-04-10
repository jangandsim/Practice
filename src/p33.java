import java.io.*;
import java.util.*;

public class p33 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int b = a.length()/3;
        int d = 0;
        for(int i = 0; i < b; i++){
        	char c1 = a.charAt(3*i);
        	char c2 = a.charAt(3*i+1);
        	char c3 = a.charAt(3*i+2);
        	if(c1-'S' != 0){
        		d++;
        	}
        	if(c2-'O' != 0){
        		d++;
        	}
        	if(c3-'S' != 0){
        		d++;
        	}
        	
        }
        System.out.println(d);
    }
}