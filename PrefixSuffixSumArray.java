import java.util.*;

public class PrefixSuffixSumArray
 {
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        for (int i = 0; i < n; i++) {
            prefix[i] = 0;
            for (int j = 0; j <= i; j++) {
                prefix[i] += arr[j];
            }
        }
        for (int i = 0; i < n; i++) {
            suffix[i] = 0;
            for (int j = i; j < n; j++) {
                suffix[i] += arr[j];
            }
        }
        System.out.println("Prefix Sum Array: " + Arrays.toString(prefix));
        System.out.println("Suffix Sum Array: " + Arrays.toString(suffix));
    }
}