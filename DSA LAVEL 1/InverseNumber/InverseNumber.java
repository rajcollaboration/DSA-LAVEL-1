
import java.util.Scanner;



public class InverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int pow = 0;
        int res = 0;
        int pos = 1;
        while (num != 0) {
            int reminder = num % 10;
            int powt = (int)Math.pow(10, reminder-1);
            pow = powt * pos;
            num = num / 10;
            res = res + pow;
            pos++;
        }
        System.out.println(res);
    }
}
