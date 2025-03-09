import java.util.Arrays;

public class SumTriplet {
    static void findTriplet(int[] arr, int target) {
        Arrays.sort(arr);  
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println("Triplet Found: (" + arr[i] + ", " + arr[left] + ", " + arr[right] + ")");
                    return; 
                } else if (sum < target) {
                    left++;  
                } else {
                    right--; 
                }
            }
        }
        System.out.println("No triplet found.");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 10;

        findTriplet(arr, target);
    }
}