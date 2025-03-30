# Recursion Problems: Step-by-Step Analysis and Big-O Complexity

## Introduction
This document explains a Java program that performs multiple recursive and iterative computations. The program includes functions for:

- Finding the minimum value in an array
- Calculating the average of an array
- Checking if a number is prime
- Computing factorial recursively
- Finding Fibonacci numbers using recursion
- Computing power using recursion
- Checking if a string consists only of digits
- Calculating the binomial coefficient
- Finding the greatest common divisor (GCD) using the Euclidean algorithm
- Printing an array in reverse order recursively

## Task 1: Finding Minimum in an Array
### Code Explanation
#### Importing Scanner Class
```java
import java.util.Scanner;
```
The Scanner class is imported to take user input.

#### Main Class Definition
```java
public class RecursionProblems {
```
Defines the main class `RecursionProblems`.

#### Main Method
```java
public static void main(String[] args) {
```
This is the entry point of the program where all user input is taken and processed.

#### Taking User Input
The program first takes input for the number of elements in an array and then fills the array.
```java
System.out.print("Enter number of elements in array: ");
int n = scanner.nextInt();
int[] arr = new int[n];
System.out.println("Enter array elements: ");
for (int i = 0; i < n; i++) {
    arr[i] = scanner.nextInt();
}
```
Next, it takes input for different computations such as prime checking, factorial calculation, Fibonacci sequence, power calculation, binomial coefficient, and GCD.

#### Execution Time Measurement
Each function call is wrapped with execution time measurement:
```java
long startTime, endTime;
startTime = System.nanoTime();
System.out.println("Minimum: " + findMin(arr, n));
endTime = System.nanoTime();
System.out.println("Time taken: " + (endTime - startTime) + " ns");
```

### Method: `findMin(int[] arr, int n)`
#### Steps:
1. Initialize `min` as the first element of the array.
2. Iterate through the array comparing each element with `min`.
3. If an element is smaller than `min`, update `min`.
4. Return `min`.

#### Big-O Complexity:
- We iterate through the array once.
- Each iteration takes O(1) time for comparison.
- For `n` elements, the total complexity is: **O(n)**.

## Task 2: Finding Average of an Array
### Method: `findAverage(int[] arr, int n)`
#### Steps:
1. Initialize `sum` to 0.
2. Loop through the array, adding each element to `sum`.
3. Compute the average by dividing `sum` by `n`.
4. Return the average.

#### Big-O Complexity:
- Summation of `n` elements takes **O(n)** time.
- Division operation takes **O(1)** time.
- Therefore: **O(n)**.

## Task 3: Checking if a Number is Prime
### Method: `isPrime(int n, int i)`
#### Steps:
1. If `n <= 2`, return whether `n` is 2.
2. If `n` is divisible by `i`, return false.
3. If `i^2 > n`, return true.
4. Recursively check divisibility with `i + 1`.

#### Big-O Complexity:
- The function checks divisibility up to `√n`.
- Since we iterate approximately `√n` times: **O(√n)**.

## Task 4: Factorial Calculation
### Method: `factorial(int n)`
#### Steps:
1. If `n` is 0 or 1, return 1.
2. Otherwise, return `n * factorial(n - 1)`.

#### Big-O Complexity:
- Recursion depth is `n`.
- Each call takes **O(1)** time.
- Therefore: **O(n)**.

## Task 5: Fibonacci Calculation
### Method: `fibonacci(int n)`
#### Steps:
1. If `n` is 0, return 0.
2. If `n` is 1, return 1.
3. Otherwise, return `fibonacci(n - 1) + fibonacci(n - 2)`.

#### Big-O Complexity:
- Each call results in two new calls.
- This forms a binary recursion tree with depth `n`.
- Total operations grow exponentially: **O(2^n)**.

## Task 6: Power Calculation
### Method: `power(int a, int n)`
#### Steps:
1. If `n` is 0, return 1.
2. Otherwise, return `a * power(a, n - 1)`.

#### Big-O Complexity:
- Recursion depth is `n`.
- Each call takes **O(1)** time.
- Therefore: **O(n)**.

## Task 7: Printing an Array in Reverse
### Method: `printReverse(int[] arr, int index)`
#### Steps:
1. If `index < 0`, stop.
2. Print `arr[index]`.
3. Recursively call with `index - 1`.

#### Big-O Complexity:
- Recursion depth is `n`.
- Each call takes **O(1)** time.
- Therefore: **O(n)**.

## Task 8: Checking If a String Contains Only Digits
### Method: `isAllDigits(String s, int index)`
#### Steps:
1. If `index == s.length()`, return true.
2. If `s[index]` is not a digit, return false.
3. Recursively check the next index.

#### Big-O Complexity:
- Recursion depth is `n`.
- Each call takes **O(1)** time.
- Therefore: **O(n)**.

## Task 9: Binomial Coefficient Calculation
### Method: `binomialCoefficient(int n, int k)`
#### Steps:
1. If `k == 0` or `k == n`, return 1.
2. Otherwise, return `binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k)`.

#### Big-O Complexity:
- Each call generates two more calls.
- This forms an exponential growth tree.
- Therefore: **O(2^n)**.

## Task 10: GCD Calculation (Euclidean Algorithm)
### Method: `gcd(int a, int b)`
#### Steps:
1. If `b == 0`, return `a`.
2. Recursively compute `gcd(b, a % b)`.

#### Big-O Complexity:
- The problem size reduces significantly in each step.
- The number of recursive calls is **O(log n)**.

##RESULTS

Enter number of elements in array: 5
Enter array elements: 
10 1 32 3 45
Minimum: 1
Time taken: 937600 ns

Enter number of elements for average calculation: 4
Enter array elements: 
3 2 4 1
Average: 2.5
Time taken: 1951500 ns

Enter a number to check for prime: 10
Composite
Time taken: 7000 ns

Enter a number for factorial calculation: 5
Factorial: 120
Time taken: 516700 ns

Enter a number for Fibonacci calculation: 17
Fibonacci: 1597
Time taken: 1014200 ns

Enter base and exponent for power calculation: 2 10
Power: 1024
Time taken: 406600 ns

Enter number of elements for reversing: 4
Enter array elements: 
1 4 6 2
Reversed Array: 2 6 4 1 
Time taken: 1230200 ns

Enter a string to check if it consists of all digits: 12345d
No
Time taken: 70900 ns

Enter n and k for binomial coefficient calculation: 7 3
Binomial Coefficient: 35
Time taken: 298000 ns

Enter two numbers for GCD calculation: 32 48
GCD: 16
Time taken: 243300 ns

Process finished with exit code 0
