import java.util.Scanner;

public class EXER_A {
    public static Scanner java = new Scanner(System.in);

    public static void main(String[] args) {
        // get 3 numbers from user
        System.out.println("enter 3 numbers");
        int a = java.nextInt();
        int b = java.nextInt();
        int c = java.nextInt();
        // check length (digits) of each number
        int len_a = String.valueOf(a).length();
        int len_b = String.valueOf(b).length();
        int len_c = String.valueOf(c).length();
        // check all numbers have same length
        boolean all_have_same_len = (len_a == len_b) && (len_a == len_c);
        //
        if (!all_have_same_len) {
            System.out.println("not");
        } else {
            if (((len_a == 1) || (len_a == 2) || (len_a == 3))) {
                System.out.println("yes");
            } else {
                System.out.println("not");
            }
        }

    }
}