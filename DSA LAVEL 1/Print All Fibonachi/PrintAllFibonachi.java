
import java.util.Scanner;



public class PrintAllFibonachi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int prevNum = 0;
        int currNumber = 1;
        int c  = prevNum + currNumber;
        for(int i = 1; i <= num; i++){
            System.out.println(i + " of fibonachi is " + prevNum);
            prevNum = currNumber;
            currNumber = c;
            c = prevNum + currNumber;
        }
    }
}
