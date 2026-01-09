import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String args[]){

        // Declare a one-dimensional array named score of type int that can hold 9 values
        int[] score = new int[9];

        // Declare and initialize a one-dimensional byte array named values of size 10 so that all entries contain 1
        byte[] values = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        long[] primeNum = new long[20];
        int[] even = new int[5];
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);
        System.out.println("Score: " + Arrays.toString(score) + "\nValues: " + Arrays.toString(values) + "\nPrime Num: " + Arrays.toString(primeNum) + "\nEven: " + Arrays.toString(even));
    }}