//Merge two array in ascending order without using any sorting algorithm
import java.util.Scanner;
public class merge_two_array{
    int a[] = new int[50];
    int b[] = new int[50];
    int c[];
    int m,n,i=0,j=0,k=0;
    void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st array limit :");
        m=sc.nextInt();
        System.out.println("Enter 2nd array limit :");
        n = sc.nextInt();
        System.out.println("Enter the element for 1st array  :");
        for(i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element for 2nd array :");
        for(j=0;j<n;j++){
            b[j]=sc.nextInt();
        }
        sc.close();
    }
    void work(){
        c = new int[m+n];
        i=j=k=0;
        while(i<m && j<n){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<m)
            c[k++]=a[i++];
        while(j<n)
            c[k++]=b[j++];
    }
    void output(){
        System.out.println("After Merging two array :");
        for(k=0;k<m+n;k++){
            System.out.println(c[k]);
        }
    }
    public static void main(String[] args) {
        merge_two_array aa = new merge_two_array();
        aa.Input();
        aa.work();
        aa.output();
    }
}

    

