package array;

import java.util.Arrays;

public class FindPairs {

    // Binary search function
    public static int binarySearch(int[] arr, int l, int r,
                                   int x)
    {
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    // Function to find pairs in two arrays whose sum equals
    // a given value
    public static void findPairs(int[] arr1, int[] arr2,
                                 int n, int m, int x)
    {
        // Sort the first array in ascending order
        Arrays.sort(arr1);

        // Iterate through the second array
        for (int i = 0; i < m; i++) {

            // Calculate the complement value needed to
            // reach the target sum
            int complement = x - arr2[i];

            // Perform binary search on the sorted first
            // array to find the complement
            if (binarySearch(arr1, 0, n - 1, complement)
                    != -1) {

                // If the complement is found, print the
                // pair
                System.out.println(complement + " "
                        + arr2[i]);
            }
        }
    }

    public static void main(String[] args)
    {
        // Example arrays and target value
        int[] arr1 = { 1, 2, 3, 7, 5, 4 };
        int[] arr2 = { 0, 7, 4, 3, 2, 1 };
        int n = arr1.length;
        int m = arr2.length;
        int x = 8;

        // Find and print pairs with sum equal to x
        findPairs(arr1, arr2, n, m, x);
    }
}