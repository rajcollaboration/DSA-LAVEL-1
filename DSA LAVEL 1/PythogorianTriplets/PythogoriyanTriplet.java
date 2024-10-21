package PythogorianTriplets;

import java.util.Scanner;

public class PythogoriyanTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int num = 0;
        while (num < 3) {
            int res = a*a + b*b;
            if (res == c*c) {
                System.out.println("Triplet: " + a + ", " + b + ", " + c);
                return;
            }else{
                int t = a;
                a = b;
                b = c;
                c = t;
            }
            num++;
        }
        System.out.println("Triplet: "+ "No Triplet found");
        
    }
}
