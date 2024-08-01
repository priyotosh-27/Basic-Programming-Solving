import java.util.Scanner;
public class Factorial {
    int n,pre=1, p;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check :");
        n=sc.nextInt();
        p = n;
    }
    void Fact(){
        if(n == 0 || n == 1){
            System.out.println(1);
        }
        while(n>0){
            pre = pre * n;
            n=n-1;
        }
    }
    void Output(){
        System.out.println("Factorial of " + p + " is " + pre);
    }
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        obj.getData();
        obj.Fact();
        obj.Output();
    }
}
