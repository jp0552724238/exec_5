import java.util.Scanner;

public class EXER_B {
    public static Scanner java = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter 1 number");
        int a = java.nextInt();
        if (((a % 4) == 0) && ((a % 3) == 0)) {
            System.out.println("1");
        } else if (((a % 4) != 0) && ((a % 3) != 0)) {
            System.out.println("4");
        } else if ((a % 3) != 0) {
            System.out.println("2");
        } else if ((a % 4) != 0) {
            System.out.println("3");
        }
        System.out.println(a / 3.0);
        System.out.println(a / 4.0);
    }
}
