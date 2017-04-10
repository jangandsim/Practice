import java.io.*;
import java.util.*;

public class p12 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int k0 = scan.nextInt();
    	int q = scan.nextInt();
    	int k = k0%n;
    	List<Integer> a = new ArrayList<>();
    	for(int a_i = 0; a_i < n; a_i++){
    		a.add(scan.nextInt());
    	}
    	List<Integer> rot = a.subList(0, n-k);
    	List<Integer> ate = a.subList(n-k, n);
    	List<Integer> newa = new ArrayList<>();
    	for(int x : ate){
    		newa.add(x);
    	}
    	for(int y : rot){
    		newa.add(y);
    	}
    	for(int q_i = 0; q_i < q; q_i++){
    		System.out.println(newa.get(scan.nextInt()));
    	}
    	
    }
}