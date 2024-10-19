package PrimeFactorization;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int divisor = 2;
        while (number > 1) {
            if (number % divisor == 0) {
                number = number / divisor;
                System.out.println(divisor + " ");
            }else{
                divisor++;
            }
            
            
        }
    }
}
