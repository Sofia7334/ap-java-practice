class ScoreBoard{
    static String gameName = "Sofia's Universe";
    int playerXP = 0;
    int playerLevel = 0;
    int playerHealth = 100; // Challenge
    String playerUsername = " ";

    ScoreBoard(String username){
        playerUsername = username;
    }
    void gainXP(int amount){
        playerXP = playerXP + amount; // accumulation, long way of doing it.
        System.out.println(playerUsername + " XP: " + playerXP);
    }
    void heal(){
        playerHealth += 50; // compound addition, compound accumulation
    }
    void damage(){
        playerHealth -= 10; // compound subtraction
    } // note you can also *=, /=, and %=*/
    void levelUp(){
        playerLevel++;
    }
    void levelDown(){
        playerLevel--;
    }
    // Challenge
    void name(){
        System.out.println(gameName);
    }
}
public class Math2 {
    public static void main(String[] args){
        ScoreBoard player1 = new ScoreBoard("SPlayAlpaca7334");
        ScoreBoard player2 = new ScoreBoard("WitchChemist");
        player1.gainXP(100);
        player1.gainXP(200);
        player1.heal();
        player1.damage();
        player1.levelUp();
        player1.levelUp();
        player1.levelDown();
        
        player2.gainXP(100);
        player2.gainXP(200);
        player2.heal();
        player2.damage();
        player2.levelUp();
        player2.levelUp();
        player2.levelDown();

        player1.name();

        System.out.println("Player 1 Level: " + player1.playerLevel);
        System.out.println("Player 1 Health: " + player1.playerHealth);

        System.out.println("Player 2 Level: " + player2.playerLevel);
        System.out.println("Player 2 Health: " + player2.playerHealth);
        
    }
}