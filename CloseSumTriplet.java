
import java.util.Arrays;

public class CloseSumTriplet {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); 
        int closestSum = nums[0] + nums[1] + nums[2]; 

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

               
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }

               
                if (sum < target) {
                    left++;  
                } else {
                    right--; 
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 10, 4, 5};
        int target = 11;
        System.out.println("Closest sum: " + threeSumClosest(nums, target));
    }
}