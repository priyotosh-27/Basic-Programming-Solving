import java.util.Scanner;
class Count_SetBit {
    static int setBits(int n) {
        int count = 0;
        
        // Method - 1
        
        while(n > 0){
            n = n & (n-1);
            count++;
        }
        
        // Method - 2
        
        // while(n > 0){
        //     if((n & 1) == 1){
        //         count++;
        //     }
        //     n = n >> 1;
        // }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(setBits(n));
    }
}