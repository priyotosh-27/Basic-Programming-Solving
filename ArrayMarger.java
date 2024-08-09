import java.util.Scanner;

class ArrayMarger {
    int a[] = new int[50];
    int b[] = new int[50];
    int c[] = new int[100];
    int n, m, i, j, k;

    public void GetData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for 1st array :");
        n = sc.nextInt();
        System.out.println("Enter the size for 2nd array : ");
        m = sc.nextInt();
        System.out.println("Enter the elements for 1st array :");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the elements for 2nd array :");
        for (j = 0; j < m; j++)
            b[j] = sc.nextInt();
    }

    public void Work(){
        i = 0;
        j = 0;
        k = 0;
        while (i < n && j < m) {
            c[k++] = a[i++];
            c[k++] = b[j++];
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
    }

    public void OutPut() {
        System.out.println("Merged array : ");
        for (int l = 0; l < k; l++) {
            System.out.print(c[l] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test obj = new test();
        obj.GetData();
        obj.Work();
        obj.OutPut();
    }
}
