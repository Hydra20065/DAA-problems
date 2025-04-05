import java.util.*;
public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int n = nums.length;

        int i;
        int j;

        for (i = 0; i < n; i++) {
            int count = 0;

            for (j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }

            }
            if (count > n / 2) {
                return nums[i];
            }
        }
        throw new RuntimeException("No majority element found");
    }
    public static void main(String[] args){
        int[] arr= {1, 2, 3, 4, 2, 2, };
        try {
            System.out.println("Majority Element: " + findMajorityElement(arr));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
