import java.io.*;
import java.util.*;

public class p21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < n; i++){
            String a1 = scan.nextLine();
            char[] a2 = a1.toCharArray();
            int b = a2.length -1;
            while(b > 0 && a2[b-1] >= a2[b]){
            	b--;
            }
            if(b <= 0){
            	System.out.println("no answer");
            } else {
            	int j = a2.length-1;
            	while(a2[j]<= a2[b-1]){
            		j--;
            	}
            	char temp = a2[b-1];
            	a2[b-1] = a2[j];
            	a2[j] = temp;
            	
            	j = a2.length - 1;
            	while(b < j){
            		temp = a2[b];
            		a2[b] = a2[j];
            		a2[j] = temp;
            		b++;
            		j--;
            	}
            	String out = new String(a2);
            	System.out.println(out);
            }
        }
    }
}