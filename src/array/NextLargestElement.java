package array;

import java.util.ArrayList;
import java.util.Stack;

/**
 * questions: Next Greater Element (NGE) for every element in given Array
 * ===========
 * Input: arr[] = [1, 3, 2, 4]
 * Output: [3, 4, 4, -1]
 * Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1.
 * ========
 * Input: arr[] = [6, 8, 0, 1, 3]
 * Output: [8, -1, 1, 3, -1]
 * Explanation: The next larger element to 6 is 8, for 8 there is no larger elements hence it is -1, for 0 it is 1 , for 1 it is 3 and then for 3 there is no larger element on right and hence -1.
 * ======
 * Input: arr[] = [50, 40, 30, 10]
 * Output: [-1, -1, -1, -1]
 * Explanation: There is no greater element for any of the elements in the array, so all are -1.
 */

public class NextLargestElement {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };

        ArrayList<Integer> res = nextLargElement(arr);
        for (int x: res) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> nextLargElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        Stack<Integer> stk = new Stack<>();

        // Initialize res with -1 for all elements
        for (int i = 0; i < n; i++) {
            res.add(-1);
        }

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Pop elements from the stack that are less
            // than or equal to the current element
            while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                stk.pop();
            }

            // If the stack is not empty, the top element
            // is the next greater element
            if (!stk.isEmpty()) {
                res.set(i, stk.peek());
            }

            // Push the current element onto the stack
            stk.push(arr[i]);
        }

        return res;

    }
}
