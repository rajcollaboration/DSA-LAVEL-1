package ToggoleCaseOfString;

import java.util.Scanner;

public class ToggoleCaseOfString {

    public static String toggoleCase (String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char uch = (char)('A' + ch - 'a');
                sb.setCharAt(i, uch);
            }else if(ch >= 'A' && ch <= 'Z'){
                char lch = (char)('a' + ch - 'A');
                sb.setCharAt(i, lch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(toggoleCase(str));
    }
}
