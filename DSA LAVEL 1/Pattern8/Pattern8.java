package Pattern8;
import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = n; i > 0; i--){
            for(int j = 1; j <= n; j++){
                if(i == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            };
            System.out.println();
        }
    }
}
