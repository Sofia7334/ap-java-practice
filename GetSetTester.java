// ENCAPSULATION
import java.util.Scanner;
public class GetSetTester {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // create a new object for my GetSet class
        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        System.out.println(player1.getUsername()); // displays default username value of null
        player1.setUsername("pineappleghost333"); // sets (or mutates) username to new value
        System.out.println(player1.getUsername()); // displays new username

        System.out.println(player2.getUsername());
        player2.setUsername("ironmouse6741");
        System.out.println(player2.getUsername());

        // [Challenge] Take in user input for username
        GetSet player3 = new GetSet();
        System.out.print("Enter a username: ");
        String userInput = input.nextLine();
        player3.setUsername(userInput);
        System.out.println(player3.getUsername());

        if (player1.getUsername().equals("pineappleghost333")){
            System.out.println("You are an admin");
        } else {
            System.out.println("Access denied");
        }

        GetSet player4 = new GetSet();
        // [Challenge] Test by printing setters and getters for ID and rank
        System.out.println(player4.getID());
        player4.setID(123456789);
        System.out.println(player4.getID());
        System.out.println(player4.getRank());
        player4.setRank("Newbie");
        System.out.println(player4.getRank());

        // [Challenge] Set input data for a new player object
        GetSet player5 = new GetSet();
        System.out.println("\nPlayer 5:");
        System.out.print("Enter a username: ");
        player5.setUsername(input.nextLine());
        System.out.print("Enter an integer ID: ");
        player5.setID(Integer.parseInt(input.nextLine()));
        System.out.print("Enter a rank: ");
        player5.setRank(input.nextLine());
        System.out.println(player5.getUsername());
        System.out.println(player5.getID());
        System.out.println(player5.getRank());

        // [Challenge] Create conditional logic to display a person's level based on their rank
        player1.setRank("Seed");
        player2.setRank("Sprout");
        player3.setRank("Budding");
        player4.setRank("Flowering");
        player5.setRank("Bloom");
        if (player1.getRank().equals("Seed")){
            System.out.println("Your journey begins!");
        } if (player2.getRank().equals("Sprout")) {
            System.out.println("The seed breaks through to grow upward!");
        } if (player3.getRank().equals("Budding")) {
            System.out.println("Little buds grow, not ready to open.");
        } if (player4.getRank().equals("Flowering")) {
            System.out.println("Look! You are growing up!");
        } if (player5.getRank().equals("Bloom")) {
            System.out.println("Look at you! All grown into a beautiful flower.");}
    }
}

class GetSet{
    // Instance variables; attributes; making the instance 'private' enforces ENCAPSULATION
    private String username;
    private int ID; // [Challenge] ADD ID attribute
    private String rank; // [Challenge] ADD "rank" attribute: (5 ranks of choice)

    // Accesor methods aka GETTERS:
    public String getUsername(){
        return username; }
    public int getID(){ // [Challenge] Create getter for ID
        return ID; }
    public String getRank(){ // [Challenge] Create getter for rank
        return rank;
    }
    // Mutator methods aka SETTERS:
    public void setUsername(String newUsername){
        this.username = newUsername; }
    public void setID(int newID){ // [Challenge] Create setter for ID
        this.ID = newID; }
    public void setRank(String newRank){ // [Challenge] Create setter for rank
        this.rank = newRank; }
}