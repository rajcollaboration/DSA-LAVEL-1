// package Pattern5;
// import java.util.Scanner;;
// public class Pattern5 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int space = n/2;
//         int star = 1;
//         for (int i = 0; i < n; i++) {
//             for (int j = space; j > 0; j--) {
//                 System.out.print(" ");
//             }
//             for(int j = 0; j < star; j++) {
//                 System.out.print("  *");
//             }
//             for (int j = space; j > 0; j--) {
//                 System.out.print(" ");
//             }
//             System.out.println();
//             if (i < n/2) {
//                 space--;
//                 star+=2;
//             }else{
//                 space++;
//                 star-=2;
//             }
//         }

//     }
// }

package Pattern5;
import java.util.Scanner;;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n/2;
        int star = 1;
        for (int i = 0; i < n; i++) {
            for (int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j < star; j++) {
                System.out.print("*");
            }
            for (int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
            if (i < n/2) {
                space--;
                star+=2;
            }else{
                space++;
                star-=2;
            }
        }

    }
}

