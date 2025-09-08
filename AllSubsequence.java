import java.util.*;

public class AllSubsequence {
    public static void printMe(int[] arr, List<Integer> temp, int idx) {

        if(idx == arr.length) {
            System.out.println(Arrays.toString(temp.toArray()));
            return;
        }

        // Take
        temp.add(arr[idx]);
        printMe(arr, temp, idx+1);
        temp.removeLast();

        // Not take
        printMe(arr, temp, idx+1);

    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        List<Integer> temp = new ArrayList<>();
        printMe(arr, temp, 0);
    }
}
