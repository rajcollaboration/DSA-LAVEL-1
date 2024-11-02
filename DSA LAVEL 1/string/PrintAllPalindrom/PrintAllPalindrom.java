package PrintAllPalindrom;

import java.util.Scanner;

public class PrintAllPalindrom {
    public static Boolean isPalindrom(String n){
        // String reverse = new StringBuilder(n).reverse().toString();
        // if(n.equalsIgnoreCase(reverse)){
        //     return true;
        // }
        // return false;
        int start = 0;
        int end = n.length() -1;
        while (start<=end) {
            char c1 = n.charAt(start);
            char c2 = n.charAt(end);
            if(c1 != c2){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                if (sub.length() != 0) {
                    if (isPalindrom(sub) == true) {
                        System.out.println(sub +"=" + " is palindrom");
                    }else{
                        System.out.println(sub + "=" + " is not palindrom");
                    }
                }
        }
    }
}
}
