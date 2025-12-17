import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        // Basic Booleans
        System.out.println("Double equals: " + (3 == 2));
        System.out.println("String equivalent: " + "Hello".equals("Helloz"));
        System.out.println("Not equals: " + (7 != 4));
        System.out.println("Greater than: " + (4 > 5));
        System.out.println();

        // if - then statement
        int num = 11;
        System.out.println(num <= 12);
        if (num <= 12){
            System.out.println("num is less than or equal to than 12");
        }
        // if else statement
        if (num <= 5){
            System.out.println("num is less than or equal to 5");
        } else {
            System.out.println("yay you did it! num is greater than 5.");
        }
        // if... else if... else
        int temperature = 44;
        if (temperature >= 85) {
            System.out.println("It's hot!");
        } else if (temperature >= 60){
            System.out.println("It's nice!");
        } else if (temperature < 40){
            System.out.println("It's cold!");
        } else {
            System.out.println("ERROR!");
        }
        // Logical 'and' operator: &&
        int age = 17;
        boolean hasPermit = false;

        if (age >= 17 && hasPermit){
            System.out.println("You can drive.");
        } else {
            System.out.println("Can't drive yet");
        }
        // Using 'or' ||
        String day = "Saturday";

        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("It's the weekend!");
        } else if (day.equals("Monday") ||
                    day.equals("Tuesday") ||
                    day.equals("Wednesday") ||
                    day.equals("Thursday") ||
                    day.equals("Friday")){
            System.out.println("It's the weekday");
        } else {
            System.out.println("That is not a day.");}

        // Challenge 1:
        String password = "P@$$vv0rD"; // Store a password

        Scanner input = new Scanner(System.in); // Ask the user to enter the password
        System.out.println("Enter the password: ");
        String entry = input.nextLine();

        if (entry.equals(password)){ // Compare them and print "Access granted" or "Access denied"
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
        // Challenge 2:
        System.out.println("Enter the password: ");
        entry = input.nextLine();

        input.close();
        }}