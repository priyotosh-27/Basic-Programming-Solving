import java.util.Scanner;

public class FactByRecurrsion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial :");
        int n = sc.nextInt();
        int result = Fact(n);
        System.out.println("Factorial of " + n + " is " + result);
    }

    public static int Fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Fact(n - 1);
        }
    }
}
