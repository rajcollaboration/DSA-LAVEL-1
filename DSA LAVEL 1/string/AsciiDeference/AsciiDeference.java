package AsciiDeference;

import java.util.Scanner;

public class AsciiDeference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(scn.nextLine());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb.charAt(0));
        for (int i = 1; i < sb.length(); i++) {
           if (i < (sb.length())) {
            int gap = sb.charAt(i) - sb.charAt(i-1);
            sb2.append(gap);
            sb2.append(sb.charAt(i));
            
            System.out.println(sb2);
           }
        }
    }
}
