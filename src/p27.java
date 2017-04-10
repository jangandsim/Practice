import java.util.*;
public class p27 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i = 0; i < a; i++){
            int b = scan.nextInt();
            int[] c = new int[b];
            int d = 0;
            boolean check = false;
            for(int j = 0; j < b; j++){
                c[j] = scan.nextInt();
                d += c[j];
            }
            int e = 0;
            for(int k = 1; k < b-1; k++){
            	d -= c[k];
            	e += c[k];
            	if(e == d/2){
            		check = true;
            	}
            	d += c[k];
            }
            if(check){
            	System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
            
        }
    }
}