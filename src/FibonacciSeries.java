import java.util.Scanner;

public class FibonacciSeries {
    private static int[] fibonacciArray;

    public static void main(String[] args) {
        System.out.println("Enter the number of terms for Fibonacci series:");
        Scanner scanner = new Scanner(System.in);
        int numTerms = scanner.nextInt();

        // Initialize the array to store Fibonacci series
        fibonacciArray = new int[numTerms];

        // Populate and print the Fibonacci series
        storeInArray(numTerms);
        printFibonacciArray();

        // Option to find an element by index, value, or calculate the sum
        int option;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Find element by index");
            System.out.println("2. Find element by value");
            System.out.println("3. Calculate sum of the series");
            System.out.println("Press any other key to exit.");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the index to find:");
                    int index = scanner.nextInt();
                    findElementByIndex(index);
                    break;
                case 2:
                    System.out.println("Enter the value to find:");
                    int value = scanner.nextInt();
                    findIndexByValue(value);
                    break;
                case 3:
                    calculateSum(numTerms);
                    break;
                default:
                    System.out.println("Exiting the program.");
                    break;
            }
        } while (option == 1 || option == 2 || option == 3);
    }

    public static void storeInArray(int numTerms) {
        for (int i = 0; i < numTerms; i++) {
            fibonacciArray[i] = fibonacci(i);
        }
    }

    public static void printFibonacciArray() {
        System.out.println("Fibonacci Series stored in array:");
        for (int value : fibonacciArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void findElementByIndex(int index) {
        if (index < 0 || index >= fibonacciArray.length) {
            System.out.println("Invalid index");
        } else {
            System.out.println("Element at index " + index + ": " + fibonacciArray[index]);
        }
    }

    public static void findIndexByValue(int value) {
        for (int i = 0; i < fibonacciArray.length; i++) {
            if (fibonacciArray[i] == value) {
                System.out.println("Index of value " + value + ": " + i);
                return;
            }
        }
        System.out.println("Value not found in the Fibonacci series");
    }

    public static void calculateSum(int numTerms) {
        int sum = 0;
        for (int i = 0; i < numTerms; i++) {
            sum += fibonacciArray[i];
        }
        System.out.println("Sum of the Fibonacci series: " + sum);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
