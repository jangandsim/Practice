import java.io.*;
import java.util.*;

public class p25 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int b = scan.nextInt();
        int k;
        for(k = 1; k < a.length()/2 +1; k++){
            String c = a.substring(0,k);
        	String d = a;
        	if(d.replaceAll(c, "").length()==0){
                break;
        	}
        	k++;
        }
        System.out.println(b/k);
    }
}