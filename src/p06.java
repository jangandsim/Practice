import java.io.*;
import java.util.*;

public class p06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int out = 0;
        int not = 0;
        ArrayList<Integer> out1 = new ArrayList<>();
        for(int i = 0; i < n; i++){
        	int a = scan.nextInt();
        	int b = scan.nextInt();
        	if(b == 0){
        		out += a;
        	} else {
        		out1.add(a);
        	}
        }
        Collections.sort(out1);
        for(int i = 0; i < out1.size(); i++){
        	if(i < out1.size() -k){
        		out-= out1.get(i);
        	} else {
        		out+= out1.get(i);
        	}
        }
        System.out.println(out);
    }
}