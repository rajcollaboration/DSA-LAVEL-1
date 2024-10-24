package Pattern9;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int start = 1;
        int end = n;
        for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= end; j++) {
            //    if (j == start || j == end) {
            //         System.out.print("*");
            //    }else{
            //     System.out.print(" ");
            //    }
            
            // }
            // // System.out.println(start + " " + end+"i"+i);
            // if ((n/2)+1 > i) {
            //      end--; 
            //      start++;  
            // }else {
            //     end++;
            //     start--;
            // }
            // System.out.println();

            for (int j = 1; j <= n; j++) {
                if (i == j || i+j-1 == n) {
                    System.out.print("*"); 
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
