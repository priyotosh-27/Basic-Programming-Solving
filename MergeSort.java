import java.util.Scanner;

class MergeSort {
    static int a[];
    static int temp[];

    public static void merge(int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        while ((i <= mid) && (j <= high)) {
            if (a[i] >= a[j])
                temp[k++] = a[j++];
            else
                temp[k++] = a[i++];
        }
        while (i <= mid)
            temp[k++] = a[i++];
        while (j <= high)
            temp[k++] = a[j++];
        for (i = low; i <= high; i++)
            a[i] = temp[i];
    }

    public static void mergesort(int low, int high) {
        int mid;
        if (low != high) {
            mid = ((low + high) / 2);
            mergesort(low, mid);
            mergesort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total elements:");
        int n = sc.nextInt();
        a = new int[n];
        temp = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        mergesort(0, n - 1);
        System.out.println("After sorting is:");
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}