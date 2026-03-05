package Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListDemo {
    public static void main(String[] args){
        /* ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list);
        System.out.println(list.size());

        // ArrayList<Integer> list2 = new ArrayList<Double>();
        // ArrayList<> list3 = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3)
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.size());

        list.add(1, 5);
        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(1);
        System.out.println(list);

        list.add(1, 5);
        list.add(2, 5);

        list.remove(Integer.valueOf(5));

        System.out.println("Contains 5: " + list.contains(5));

        Collections.sort(list);
        Integer value = Collections.binarySearch(list, 4);
        System.out.println(value);
        System.out.println(list);

        System.out.println(list.toString());
        
        Integer[] arr = list.toArray(new Integer[0]);
        for (int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();

        ArrayList<Integer> splitList = new ArrayList<Integer>(list.subList(3,list.size()-1));
        System.out.println(splitList);

        list.clear();
        System.err.println(list);
        System.out.println(list.size()); */

    // CHALLENGES

    // Create an arrayList with 10 random numbers
    ArrayList<Integer> arrayList = new ArrayList<>(10);
    for (int i = 0; i < 10; i++){
        arrayList.add((int)(Math.random() * 101));
    } System.out.println(arrayList);
    // Remove all odd from that list
    ArrayList<Integer> oddIndices = new ArrayList<>();
    for (int i = 0; i < 10; i++){
        if ((arrayList.get(i) % 2) != 0){
            oddIndices.add(i);
        }}
    Collections.reverse(oddIndices);
    for (int i = 0; i < oddIndices.size(); i++){
        arrayList.remove((int) oddIndices.get(i));
    } System.out.println(arrayList);

    // Make a guest list that allows the user to enter names
    ArrayList<String> guestList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    System.out.println("\nWho is invited?");
    String line = input.nextLine();
    while (!line.equalsIgnoreCase("exit")){
        guestList.add(line);
        line = input.nextLine();
    } // continue until you type exit
    System.out.println("Who do you want to check for in the guest list?");
    // if the name exists tell the user that "this person is invited!"
    line = input.nextLine();
    while (!line.equalsIgnoreCase("exit")){
        if (guestList.contains(line)){
            System.out.println("They are invited!");
        } else {
            System.out.println("They are not invited.");
        }
        line = input.nextLine();
    }

    // Create a list of grocery items
    ArrayList<String> groceryList = new ArrayList<>();
    groceryList.add("Strawberries");
    groceryList.add("Marshmallows");
    groceryList.add("Chocolate");
    groceryList.add("Watermelon");
    groceryList.replaceAll(String::toLowerCase);
    // continue until you type exit
    System.out.println("\nCheck your grocery list.");
    line = input.nextLine().toLowerCase();
    while (!line.equalsIgnoreCase("exit")){
    // if the user types in a food print out the index
        if (groceryList.contains(line)){
            System.out.println(groceryList.indexOf(line));
    // If not print "Not Found" and add it to the list
        } else {
            System.out.println("Not Found");
            groceryList.add(line);
        }
        line = input.nextLine().toLowerCase();
    }
    input.close();}
}