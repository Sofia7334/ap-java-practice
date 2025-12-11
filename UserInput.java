import java.net.SocketImplFactory;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);    
        /* System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Enter your age");
        String age = input.nextLine();
        int ageConverted = Integer.parseInt(age);
        System.out.println("Next year " + name + " will be: " + (ageConverted + 1));

        System.out.println("What is your height in meters?");
        double height = Double.parseDouble(input.nextLine());
        System.out.println("You are " + height + " meters tall."); */

        // Challenge 1: email address generator
        System.out.println("Enter a word: ");
        String word1 = input.nextLine();
        System.out.println("Enter another word: ");
        String word2 = input.nextLine();
        System.out.println("Enter a number: ");
        int number1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter another number: ");
        int number2 = Integer.parseInt(input.nextLine());
        String numString = String.valueOf(number1 + number2);
        numString = numString.substring(0, 2);
        System.out.println("Generated Email address: " + word1 + word2 + numString + "@gmail.com");
    }
}