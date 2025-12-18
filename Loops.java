import java.util.Scanner;
import java.util.Random;

public class Loops {    
    public static void main(String[] args) {/*
        // break
        // continue
        // return
        for (int i = 0; i < 5; i += 1) {
            for (int j = 0; j < 5; j++) {
                System.out.println(j);
                if (j == 2) {
                    break;
                }}}
        // for (int i = 0; i < 5; i++)
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }

        boolean isContinuing = true;
        int z = 0;
        while (isContinuing){
            z++;

            if (z == 20) {
                isContinuing = false;
            }
            System.out.println(z);
        }}}*/
// Challenge 1
for (int i = 0; i<= 100; i ++){
    if (i % 3 == 0){
        System.out.print("foo");}
    if (i % 5 == 0){
        System.out.print("bar");}
    System.out.println();
} System.out.println();

// Challenge 2
System.out.println("Multiplication Table:\n*");
for (int a = 1; a <= 12; a += 1){
    for (int b = 1; b <= 12; b += 1) { // Print out a multiplication table from 1-12
        System.out.print(a*b + "\t");}
    System.out.println();
}
// Challenge 3
Scanner input = new Scanner(System.in);
System.out.println("\nWhat number are you guessing?"); // Design a guessing game between 3 numbers
int guess = Integer.parseInt(input.nextLine());
Random random = new Random();
int target = random.nextInt(1, 4);
while (guess != target){
    System.out.println("That is the wrong answer. The number changed! Guess again."); // If you guess incorrectly, then game keeps playing.
    target = random.nextInt(1, 4); // The number changes every time you guess wrong.
    System.out.println("\nWhat number are you guessing?");
    guess = Integer.parseInt(input.nextLine());}
System.out.println("That is the correct answer! You win!"); // If you guess the number correctly then you win.

input.close();}}