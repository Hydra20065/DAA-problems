public class FirstOccurance {
    public static int findFirstOccurance(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;

    }
    public static void main(String [] args){
        int[] sortedArray={1, 2, 2, 2, 3, 4};
        int target=2;

        int firstOccurance = findFirstOccurance(sortedArray, target);

        if (firstOccurance != -1) {
            System.out.println("First Occurance of " + target + " is at index: " + firstOccurance);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}