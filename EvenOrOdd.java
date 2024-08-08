import java.util.Scanner;

public class EvenOrOdd {
    int n;

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check :");
        n = sc.nextInt();
    }

    public void Work() {
        if (n % 2 == 0)
            System.out.println(n + " is an even number.");
        else
            System.out.println(n + " is an odd number.");
    }

    public static void main(String[] args) {
        EvenOrOdd obj = new EvenOrOdd();
        obj.Input();
        obj.Work();
    }
}
