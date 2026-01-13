import java.util.Arrays;
public class BYTESPractice2 {
    public static void main(String[] args){

    // Write a statement that declares an array named price of type int that can hold 10 numbers
    int[] price = new int[10];
    System.out.println(Arrays.toString(price));

    // An integer array number of size 20
    int[] number = new int[20];
    // Write a loop that will go through and initialize all the elements to a value of 4.
    for (int i = 0; i < 20; i++) {
        number[i] = 4;}
    System.out.println(Arrays.toString(number));

    int[] array = {0, 12, 6, 7, 5, 9, 4, 5};
    // Write the code that will find and display the median (middle number) of an array.
    Arrays.sort(array);
    double midpoint = (array.length)/2;
    double median = 0;
    if (array.length % 2 == 1){
        median = array[(int) midpoint];
    // Note: If the array has an even number of elements, average the middle two numbers.
    } else {
        double midnum1 = array[(int) (midpoint -1)];
        double midnum2 = array[(int) midpoint];
        System.out.println(midpoint);
        System.out.println(midnum1);
        System.out.println(midnum2);
        median = (midnum1 + midnum2)/2;}
    System.out.println("Array: " + Arrays.toString(array) + "\t Median: " + median);
}}