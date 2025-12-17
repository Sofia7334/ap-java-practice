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
        System.out.print("foo");
    }
    if (i % 5 == 0){
        System.out.print("bar");
    }
    System.out.println();
}
}}