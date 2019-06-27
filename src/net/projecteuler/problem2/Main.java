package net.projecteuler.problem2;

public class Main {

    public static void main(String[] args) {
	    FibonacciSequence result = new FibonacciSequence();
        System.out.println("The sequence:");
	    result.generateSequence(25);
        System.out.println(" ");
        System.out.println("One number:");
        System.out.println(result.createFibonacci(25));
    }
}
