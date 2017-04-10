import java.io.*;
import java.util.*;

public class p24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double k = (x*a+b*y)/(a*a+b*b);
        double n = (a*y-b*x)/(a*a+b*b);
        System.out.println(k);
        System.out.println(n);
    }
}