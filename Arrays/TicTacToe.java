// Tic-Tac-Toe Challenge
import java.util.Random;

public class TicTacToe {
    public static void main(String[] args){
    // Create a 3×3 char array that represents a valid Tic-Tac-Toe board.
    char[][] board = new char[3][3];

    //  Randomly fill each cell with an 'X',or 'O'.
    boolean searching = true;
    Random random = new Random();
    for (int i = 0; i < 5; i += 1) {
        searching = true;
        while (searching) {
            int index1 = random.nextInt(3);
            int index2 = random.nextInt(3);
            if (board[index1][index2] != 'O'){
                board[index1][index2] = 'O';
                searching = false;
    }}}
    searching = true;
    for (int i = 0; i < 4; i += 1) {
        searching = true;
        while (searching) {
            int index1 = random.nextInt(3);
            int index2 = random.nextInt(3);
            if (board[index1][index2] != 'X' && board[index1][index2] != 'O'){
                board[index1][index2] = 'X';
                searching = false;
    }}}
    //  Print the board to the screen.
    for (int i = 0; i < board.length; i++){
        System.out.print("\n\t");
        for (int j = 0; j < board[i].length; j++){
            if (j == 0 || j == 1){
            System.out.print(board[i][j] + " | ");}
            if (j == 2){
                System.out.print(board[i][j]);
            if (i == 0 || i == 1){
                System.out.print("\n      —————————————");}}}}
    System.out.println("\n");

    // Part II: Refactor the code to check if X won, O won, both won, or nobody won.
    char winner = '-';
    // Rows
    for (int i = 0; i < 3; i++){
            if (board[i][0] == board [i][1] && board [i][0] == board[i][2]){
                if (board[i][0] == 'O'){
                    if (winner == 'X'){
                        winner = 'd';
                    } else {
                    winner = 'O';}
                } else if (board[i][0] == 'X'){
                    if (winner == 'O'){
                        winner = 'd';
                    } else {
                    winner = 'X';}}}}
    // Columns
    for (int j = 0; j < 3; j++){
            if (board[0][j] == board [1][j] && board [0][j] == board[2][j]){
                if (board[0][j] == 'O'){
                    if (winner == 'X'){
                        winner = 'd';
                    } else {
                    winner = 'O';}
                } else if (board[0][j] == 'X'){
                    if (winner == 'O'){
                        winner = 'd';
                    } else {
                    winner = 'X';}}}}
    // Diagonals
    if (board[0][0] == board[1][1] && board[2][2] == board[0][0]){
        if (board[0][0] == 'O'){
            if (winner == 'X'){
                winner = 'd';
            } else {
                winner = 'O';}
        } else if (board[0][0] == 'X'){
            if (winner == 'O'){
                winner = 'd';
            } else {
                winner = 'X';}}}
    if (board[0][2] == board[1][1] && board[1][1] == board[2][0]){
        if (board[1][1] == 'O'){
            if (winner == 'X'){
                winner = 'd';
            } else {
                winner = 'O';}
        } else if (board[1][1] == 'X'){
            if (winner == 'O'){
                winner = 'd';
            } else {
                winner = 'X';}}}

    if (winner == 'O' || winner == 'X'){
        System.out.println("The winner is " + winner + "!");
    } else if (winner == 'd') {
        System.out.println("The game is a draw!");
    } else {
        System.out.println("Nobody won the game!");}
}}