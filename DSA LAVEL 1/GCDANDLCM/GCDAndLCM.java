package GCDANDLCM;

import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int temp;
        int n1 = num1;
        int n2 = num2;
        while (num2 % num1 != 0) {
            temp = num2;
            num2 = num1;
            num1 = temp % num1;
        }

        System.out.println(num1);
        System.out.println((n1 * n2) / num1);
    }
}
