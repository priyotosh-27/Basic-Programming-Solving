import java.util.Scanner;

public class ReverseIntger {
    int n, rev = 0;

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        sc.close();
    }

    public void Work() {
        while (n != 0) {
            rev = (rev * 10) + n % 10;
            n = n / 10;
        }
    }

    public void Output() {
        System.out.println("Reverse = " + rev);
    }

    public static void main(String[] args) {
        ReverseIntger obj = new ReverseIntger();
        obj.Input();
        obj.Work();
        obj.Output();
    }
}
