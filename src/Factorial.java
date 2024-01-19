import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter number to print factorial");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        System.out.println("Iterative solution: "+iterative(number));
        System.out.println("Recursive solution: "+recursive(number));
    }
    public static int iterative(int n) {
        int fact=1;
        for(int i=1;i<=n;i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int recursive(int n){
        if(n==0){
            return 1;
        }
        else return n*recursive(n-1);
    }
}
