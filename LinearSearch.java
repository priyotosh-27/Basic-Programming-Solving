import java.util.Scanner;

public class LinearSearch {
    int n, key, i, flag = 0;
    int a[] = new int[100];

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        n = sc.nextInt();
        System.out.println("Enter the element :");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element that you want to search :");
        key = sc.nextInt();
        sc.close();
    }

    public void Work() {
        for (i = 0; i < n; i++) {
            if (a[i] == key) {
                flag = 1;
                break;
            }
        }
    }

    public void OutPut() {
        if (flag == 1)
            System.out.println("Found at index : " + i);
        else
            System.out.println("Not Found");
    }

    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        obj.getData();
        obj.Work();
        obj.OutPut();
    }
}
