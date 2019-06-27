package net.projecteuler.problem2;

public class FibonacciSequence {
    private int n;


    public int createFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else
            return createFibonacci(n - 2) + createFibonacci(n - 1);
    }

    public void generateSequence(int n) {
        for (int i = 1; i <=  n; i++ ) {
            System.out.print(createFibonacci(i));
            System.out.print(", ");
        }
    }

}
