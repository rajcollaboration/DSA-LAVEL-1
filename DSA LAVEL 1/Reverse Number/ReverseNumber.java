
import java.util.Scanner;



public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int num = scn.nextInt();
        while (num != 0) { 
            System.out.println(num % 10);
            num = num / 10;
        }

    }
}
