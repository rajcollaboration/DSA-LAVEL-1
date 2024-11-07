package PermutionOfString;


import java.util.Scanner;



public class PermutionOfString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);   
        String str = scn.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for(int i = 0; i < str.length() * 2; i++){
            for(int j = sb.length(); j > 0; j--){
                System.out.print(sb.charAt(i % j));
                sb.deleteCharAt( i % j );
            }
            sb.append(str);
            System.out.println();
        }
    }
}
