import java.io.*;
import java.util.*;

public class p29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.nextLine();
        String b = scan.nextLine();
        StringBuilder c = new StringBuilder(b);
        int count = 0;
        while(c.indexOf("010") >= 0){
        	int d = c.indexOf("010") + 2;
        	c.deleteCharAt(d);
        	c.insert(d, '1');
        	count++;
        }
        System.out.println(count);
    }
}