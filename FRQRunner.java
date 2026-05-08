import java.util.Arrays;
public class FRQRunner {
  public static void main(String args[]){
	int[] list = {3, 8, 2, 5, 1};
	int n = list.length;
// outer loop
for (int i = 0; i < n; i++){
	int minIndex = i;
	// inner loop
	for (int j = i + 1; j < n; j++){
		// conditional logic to compare values
		if (list[j] < list[minIndex]){
			minIndex = j;
		}
	}
	// swap numbers
	int temp = list[i];
	list [i] = list[minIndex];
	list[minIndex] = temp;
	System.out.println(Arrays.toString(list));
}
System.out.println(Arrays.toString(list));
}}