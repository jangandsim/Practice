import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class p01 {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n1 = in.nextInt();
	        int n2 = in.nextInt();
	        int n3 = in.nextInt();
	        int h1[] = new int[n1];
	        int s1 = 0;
	        for(int h1_i=0; h1_i < n1; h1_i++){
	        	int t1 = in.nextInt();
	            h1[h1_i] = t1;
	            s1 += t1;
	        }
	        int h2[] = new int[n2];
	        int s2 = 0;
	        for(int h2_i=0; h2_i < n2; h2_i++){
	        	int t2 = in.nextInt();
	            h2[h2_i] = t2;
	            s2 += t2;
	        }
	        int h3[] = new int[n3];
	        int s3 = 0;
	        for(int h3_i=0; h3_i < n3; h3_i++){
	            int t3 = in.nextInt();
	            h3[h3_i] = t3;
	            s3 += t3;
	        }
	        int ind1 = 0;
	        int ind2 = 0;
	        int ind3 = 0;
	        
	        while(!(s1 == s2 && s2 == s3)){
	        	if(s1 > s2 && s1 > s3){
	        		s1 -= h1[ind1];
	        		ind1++;
	        	} else if (s2 > s1 && s2 > s3){
	        		s2 -= h2[ind2];
	        		ind2++;
	        	} else {
	        		s3 -= h3[ind3];
	        		ind3++;
	        	}
	        }
	        System.out.println(s1);
	    }
	}