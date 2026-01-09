// Exercise 3 
import java.util.Scanner;
// Create a file ComputeAvg.java
public class ComputeAvg {
        public static void main(String[] args){
            int sum = 0;
            double average = 0.0;

            // In a certain class, there are five tests, each worth 100 points
            int[] scores = new int[5];

            // Input five test scores from the console 
            Scanner input = new Scanner(System.in);    
            for (int i = 0; i < scores.length; i++) {
                System.out.println("Enter the test score: ");
            // Store the test scores in an array
                scores[i] = input.nextInt();}
             
            for (int i = 0; i < scores.length; i++){
                sum = sum + scores[i];}
            // Calculate the student’s average scores
                average = (double) sum / scores.length;

            System.out.println("The average test score is " + average);
            input.close();}}