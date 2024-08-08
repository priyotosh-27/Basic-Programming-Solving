import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

    int n, i, j, key, flag = 0, mid;
    int a[] = new int[100];

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        n = sc.nextInt();
        System.out.println("Enter the element : ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, 0, n);
        System.out.println("Enter the element that you want to search :");
        key = sc.nextInt();
        sc.close();
    }

    public void Search() {
        i = 0;
        j = n - 1;
        while (i <= j && flag == 0) {
            mid = (i + j) / 2;
            if (a[mid] == key) {
                flag++;
                break;
            }
            if (a[mid] > key) {
                j = mid - 1;
            }
            if (a[mid] < key) {
                i = mid + 1;
            }
        }
    }

    public void OutPut() {
        if (flag != 0) {
            System.out.println("Element found at index : " + mid);
        } else {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        obj.Input();
        obj.Search();
        obj.OutPut();
    }
}
