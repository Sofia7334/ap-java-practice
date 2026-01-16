public class Arrays2DPractice {
    public static void main(String[] args){
        // Java Arrays Practice 1, 1 of 7
            // Array Tracing #1
            // 7654
    
        // Java Arrays Practice 1, 2 of 7
            // Array Tracing #2
            // 2 3 1 2
            // 2 1 0 2
            // 3 1 0 4

        // Java Arrays Practice 1, 3 of 7
            // Array Tracing #3
            // 2
        
        // Java Arrays Practice 1, 4 of 7
            // Array Tracing #4
            // 0 3 6 1 4 7

        // Java Arrays Practice 1, 5 of 7
            // Array Tracing #5
            // 7
            // 14
            // 11
            // 11
            // 5

        // Java Arrays Practice 1, 6 of 7
            // Array Tracing #6
            // 333
            // 444

        // Java Arrays Practice 1, 7 of 7
            // Array Tracing #7
            // 333
            // 765

        // Java Arrays Practice 4, 1 of 8
            // Write a statement that declares an array named winners of type double that can hold 18 numbers.
            double[] winners = new double[18];
        
        // Java Arrays Practice 4, 2 of 8
            // Write a statement that declares an integer array named first_array with 8 numbers that are initialized to the first 8 prime numbers.
            int[] first_array = {2, 3, 5, 7, 11, 13, 17, 19};

        // Java Arrays Practice 4, 3 of 8
            // An integer array called num of size 20
            int[] num = new int[20];
            // Write a loop that will go through and initialize all the elements to double their index value.
            for (int i = 0; i < 20; i++){
                num[i] = 2 * i; }

        // Java Arrays Practice 4, 4 of 8
                // Write an array that is 30x40, called maze
                int[][] maze = new int[30][40];
        
        // Java Arrays Practice 4, 5 of 8
                // 16 by 32 element array
                int[][] array = new int[16][32];
                // Write a loop that will print every value in a to the screen.
                for (int i = 0; i < array.length; i++){
                    System.out.print("\n\t");
                    for (int j = 0; j < array[i].length; j++){
                        System.out.print(array[i][j] + "\t");}}
                System.out.println("\n");

        // Java Arrays Practice 4, 6 of 8
                // 231
                // 221
                // 023
                // 104

        // Java Arrays Practice 4, 7 of 8
                // 0

        // Java Arrays Practice 4, 8 of 8
                // 1286864
}}