import java.util.Scanner;

public class RecursionProblems {

    /*
     * findMin Function:
     * We iterate through the array once to find the minimum value.
     * Each comparison takes O(1), and we perform (n-1) comparisons.
     * Therefore, the time complexity is:
     * T(n) = O(n)
     */
    public static int findMin(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /*
     * findAverage Function:
     * We iterate through the array once to compute the sum.
     * Summing up n elements takes O(n), and division takes O(1).
     * Therefore, the time complexity is:
     * T(n) = O(n)
     */
    public static double findAverage(int[] arr, int n) {
        if (n == 0) return 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / n;
    }

    /*
     * isPrime Function:
     * We check divisibility recursively up to sqrt(n).
     * Since we reduce the problem size by approximately sqrt(n) each step,
     * the time complexity is:
     * T(n) = O(sqrt(n))
     */
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return (n == 2);
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    /*
     * factorial Function:
     * We recursively multiply numbers from n down to 1.
     * This results in n recursive calls.
     * Therefore, the time complexity is:
     * T(n) = O(n)
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    /*
     * fibonacci Function:
     * Each call results in two additional recursive calls,
     * leading to an exponential number of computations.
     * Therefore, the time complexity is:
     * T(n) = O(2^n)
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /*
     * power Function:
     * We perform n recursive multiplications.
     * Therefore, the time complexity is:
     * T(n) = O(n)
     */
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    /*
     * printReverse Function:
     * We recurse n times to print the array in reverse order.
     * Each recursive call takes O(1), and there are n calls.
     * Therefore, the time complexity is:
     * T(n) = O(n)
     */
    public static void printReverse(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        printReverse(arr, index - 1);
    }

    /*
     * isAllDigits Function:
     * We check each character recursively.
     * Since each character is checked in O(1), and there are n characters,
     * the time complexity is:
     * T(n) = O(n)
     */
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }

    /*
     * binomialCoefficient Function:
     * Each call generates two more recursive calls, leading to an exponential complexity.
     * Therefore, the time complexity is:
     * T(n) = O(2^n)
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    /*
     * gcd Function (Euclidean Algorithm):
     * Each recursive call reduces the problem size significantly.
     * Therefore, the time complexity is:
     * T(n) = O(log(min(a, b)))
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startTime, endTime;

        // Task 1: Find Minimum
        System.out.print("\nEnter number of elements in array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        startTime = System.nanoTime();
        System.out.println("Minimum: " + findMin(arr, n));
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " ns");

        // Task 2: Find Average
        System.out.print("\nEnter number of elements for average calculation: ");
        int m = scanner.nextInt();
        int[] avgArr = new int[m];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < m; i++) {
            avgArr[i] = scanner.nextInt();
        }

        startTime = System.nanoTime();
        System.out.println("Average: " + findAverage(avgArr, m));
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " ns");

        // Task 3: Check Prime
        System.out.print("\nEnter a number to check for prime: ");
        int primeCheck = scanner.nextInt();
        startTime = System.nanoTime();
        boolean isPrimeNumber = isPrime(primeCheck, 2);
        endTime = System.nanoTime();

        System.out.println(isPrimeNumber ? "Prime" : "Composite");
        System.out.println("Time taken: " + (endTime - startTime) + " ns");

        // Task 4: Factorial Calculation
        System.out.print("\nEnter a number for factorial calculation: ");
        int factNum = scanner.nextInt();
        startTime = System.nanoTime();
        System.out.println("Factorial: " + factorial(factNum));
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " ns");

        // Task 5: Fibonacci Calculation
        System.out.print("\nEnter a number for Fibonacci calculation: ");
        int fibNum = scanner.nextInt();
        startTime = System.nanoTime();
        System.out.println("Fibonacci: " + fibonacci(fibNum));
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " ns");

        // Task 6: Power Calculation
        System.out.print("\nEnter base and exponent for power calculation: ");
        int base = scanner.nextInt();
        int exp = scanner.nextInt();
        startTime = System.nanoTime();
        System.out.println("Power: " + power(base, exp));
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " ns");

        // Task 7: Reverse Array
        System.out.print("\nEnter number of elements for reversing: ");
        int revN = scanner.nextInt();
        int[] revArr = new int[revN];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < revN; i++) {
            revArr[i] = scanner.nextInt();
        }

        System.out.print("Reversed Array: ");
        startTime = System.nanoTime();
        printReverse(revArr, revN - 1);
        endTime = System.nanoTime();
        System.out.println("\nTime taken: " + (endTime - startTime) + " ns");

        // Task 8: Check If String Consists of Only Digits
        System.out.print("\nEnter a string to check if it consists of all digits: ");
        String digitStr = scanner.next();
        startTime = System.nanoTime();
        boolean allDigits = isAllDigits(digitStr, 0);
        endTime = System.nanoTime();

        System.out.println(allDigits ? "Yes" : "No");
        System.out.println("Time taken: " + (endTime - startTime) + " ns");

        // Task 9: Binomial Coefficient
        System.out.print("\nEnter n and k for binomial coefficient calculation: ");
        int binN = scanner.nextInt();
        int binK = scanner.nextInt();
        startTime = System.nanoTime();
        System.out.println("Binomial Coefficient: " + binomialCoefficient(binN, binK));
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " ns");

        // Task 10: GCD Calculation
        System.out.print("\nEnter two numbers for GCD calculation: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        startTime = System.nanoTime();
        System.out.println("GCD: " + gcd(a, b));
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " ns");

        scanner.close();
    }
}