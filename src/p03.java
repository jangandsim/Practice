import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class p03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i = 0; i < a; i++){
            int b = scan.nextInt();
            int out1 = 0;
            int out2 = 0;
            int out3 = 0;
            for(int k = 0; k < b; k++){
                int c = scan.nextInt();
                if(c > 0){
                	out1+=c;
                }
                if(out2 + c > 0){
                	out2 +=c;
                	if(out2 > out3){
                		out3 = out2;
                	}
                } else{
                	if(out2 > out3){
                		out3 = out2;
                		out2 = 0;
                	}
                }
            System.out.printf("%d %d", out3, out2);   
            }
        }
    }
}