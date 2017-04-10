import java.io.*;
import java.util.*;

public class p20 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[k];
        Arrays.fill(a, 0);
        for(int i = 0; i < n; i++){
            a[scan.nextInt()%k]++;
        }
        int out = 0;
        for(int j = 1; j <= (k-1)/2; j++){
            if(a[j] < a[k-j]){
                out+=a[k-j];
            } else {
                out+=a[j];
            }
        }
        if(a[0] > 0){
            out++;
        }
        if(k%2 ==0 && a[k/2] > 0){
            out++;
        }
        System.out.println(out);
    }
}