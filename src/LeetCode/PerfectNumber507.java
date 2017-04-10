package LeetCode;

public class PerfectNumber507 {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int com = 0;
        for(int i = 2; i*i <= num; i++) {
            if (num % i == 0 && i*i == num) {
                com += i;
            } else if (num % i == 0) {
                com += i;
                com += num/i;
            }
        }
        return com + 1 == num;
    }
}