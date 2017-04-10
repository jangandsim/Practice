import java.io.*;
import java.util.*;

public class p28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		StringBuilder b = new StringBuilder(a);
		int l = 0;
		while(l+1 < b.length()){
			if(b.charAt(l) == b.charAt(l+1)){
				b.deleteCharAt(l);
				b.deleteCharAt(l);
				l = 0;
			} else {
                l++;
            }
		}
        String c = new String(b);
        if(c.length() == 0){
        	c = "Empty String";
        }
		System.out.println(c);

	}

}