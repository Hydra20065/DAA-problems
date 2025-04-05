public class LastOccurrence {
    public static int findLastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
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

        int lastOccurrence = findLastOccurrence(sortedArray, target);

        if (lastOccurrence != -1) {
            System.out.println("Last Occurance of " + target + " is at index: " + lastOccurrence);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}


