import java.util.Arrays;

public class MakePair {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 2, 3, 2, 3};
        System.out.println("Has all elements in pairs: " + hasPairs(arr));
    }

    public static boolean hasPairs(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i+=2  ) {
            if (i + 1 >= arr.length || arr[i] != arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}