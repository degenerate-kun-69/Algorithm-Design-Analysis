import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter number to print factorial");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int factorial=iterative(number);
        int factorialrecursive=recursive(number);
        System.out.println("Iterative solution: "+factorial);
        System.out.println("Recursive solution: "+factorialrecursive);
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
