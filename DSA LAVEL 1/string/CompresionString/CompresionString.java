
import java.util.Scanner;

public class CompresionString {

    public static String compression2(String st){
        int count = 1;
        String res = "";
        res += st.charAt(0);
        for (int i = 1; i < st.length(); i++) {
            char current = st.charAt(i);
            char previous = st.charAt(i - 1);
            if (current == previous) {
                count++;
            }else{
                if (count > 1) {
                    res += count;
                    count = 1;
                }
                res += current; 
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "aaassssssssssgssssssssssssssssssssssssssssssssssssssssssssssssssssssssgggggggggggggggggghhhhhy";
        String s = "";
        s += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char next = str.charAt(i-1);
            if (current != next ) {
                s += current;
            }
        }
        System.out.println(s);
        System.out.println(compression2(str));
    }
}