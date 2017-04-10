import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class testing {

    public static void main(String[] args) {
        String[] a =  new String[10];
        
        for(String b:a){
        System.out.println(b);
        }
        
        
        a[0] = "Han";
        a[1] = "Young";
        for(int i = 0; i < 9; i++) {
            a[i] = a[++i];
        }
        for(String c:a){
            System.out.println(c);
        }
    }
}
