package AI;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LaptopBatteryLife {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        double timeCharged = in.nextDouble();
        File k =  new File("../source/trainingdata.txt");
        Scanner scan = new Scanner(k);
        String a = scan.nextLine();
        String[] b = a.split(",");
        double g1 = Double.parseDouble(b[0]);
        double g2 = Double.parseDouble(b[1]);
        while(scan.hasNext()){
            String y = scan.nextLine();
            String[] h = a.split(",");
            double q1 = Double.parseDouble(h[0]);
            double q2 = Double.parseDouble(h[1]);
            g1 += q1;
            g2 += q2;
        }
        System.out.println(g1*timeCharged/g2);
    }
}
