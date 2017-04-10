package LeetCode;

public class ComplxNumberMultiplication537 {
    public static void main(String[] args) {
        String first = "1+1i";
        String second = "1+1i";
        System.out.println(complexNumberMultiply(first, second));
    }
    public static String complexNumberMultiply(String a, String b) {
        int[] ade = toint(a);
        int[] bde = toint(b);
        String out = String.format("%d+%di", ade[0]*bde[0]-ade[1]*bde[1], ade[0]*bde[1]+ade[1]*bde[0]);
        return out;
    }
    private static int[] toint(String a) {
        int[] out = new int[2];
        String[] b = a.split("\\+");
        out[0] = Integer.parseInt(b[0].replaceAll("[^0-9]",""));
        out[1] = Integer.parseInt(b[1].replaceAll("[^0-9]",""));
        if(b[0].contains("-")) {
            out[0] *= -1;
        }
        if(b[1].contains("-")) {
            out[1] *= -1;
        }
        return out;
    }
}