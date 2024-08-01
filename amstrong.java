import java.util.Scanner;

class A{
    int a, m, n;
    Scanner sc = new Scanner(System.in);
    public void Input()
    {
        System.out.println("Enter the number to check : ");
        a=sc.nextInt();
        m=a;
        n=m;
    }
    
}
class B extends A {
    int count=0, s=1, sum=0, p;
    public void Work()
    {
        while (a>0) {
            count++;
            a=a/10;
        }
        p = count;
    }
    public void job()
    {
        while(m>0)
        {
            count = p;
            s=1;
            while (count>0) {
                s=s*(m%10);
                count--;
            }
            sum=sum+s;
            m=m/10;
        }
        
    }
}
class C extends B {
    public void check(){
        if(sum == n)
            System.out.println("Amstrong Number " );
        else
            System.out.println("Not Amstrong Number ");
    }
    
}
public class amstrong {
    public static void main(String[] args) {
        C obj = new C();
        obj.Input();
        obj.Work();
        obj.job();
        obj.check();
    }
}
