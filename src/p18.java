import java.io.*;
import java.util.*;

public class p18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> prime = new ArrayList<>();
        prime.add(2);
        for(int i = 0; i < n; i++){
            int m = scan.nextInt();
            int a = scan.nextInt();
            int count = 1;
            long out = 1;
            while(prime.size() < m){
                prime.add(nextPrime(prime));
            }
            for(int x : prime){
            	int temp1 = 1;
            	for(int j = 0; j < temp1 + a; j++){
            		out = (out*x)%(1000000007);
            	}
            	temp1++;
            }
            System.out.println(out);
        }
    }
    static int nextPrime(ArrayList<Integer> x){
    	boolean yet = true;
    	int z = x.get(x.size()-1)+1;
    	while(yet){
    		boolean check = true;
    		for(int a : x){
    			if(z%a == 0){
    				check = false;
    			}
    		}
    		if(check){
    			return z;
    		} else {
    			z++;
    		}
    	}
    	return 0;
    }
}