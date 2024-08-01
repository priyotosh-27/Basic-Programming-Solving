//Sum of maximum Subaraay

import java.util.Scanner;
public class sum0f_max_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, max = 0, i;
        int a[] = new int[100];
        System.out.println("Enter the length of the array : ");
        n = sc.nextInt();
        System.out.println("Enter the elements :");
        for(i=0; i<n; i++)
        {
            a[i]= sc.nextInt();
        }
        for(i=0; i<n; i++){
            sum=sum+a[i];
            if(sum<0){
                sum = 0;
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println("Sum of maximum subarray : " + max);
    }
}
