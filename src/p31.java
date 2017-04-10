import java.io.*;
import java.util.*;

public class p31 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.nextLine();
        String b = scan.nextLine();
        Set<Character> c = new TreeSet<>();
        char[] d = b.toCharArray();
        for(char e: d){
        	c.add(e);
        }
        if(a == 1){
        	System.out.println(c.size());
        } else {
	        for(int i = 1; i < a; i++){
	        	String f = scan.nextLine();
	        	List<Character> h = new ArrayList<>();
	        	for(char g : c){
	        		if(f.indexOf(g) == -1){
	        			h.add(g);
	        		}
	        	}
	        	for(char m : h){
	        		c.remove(m);
	        	}
	        }
	        System.out.println(c.size());
        }
        
    }
}