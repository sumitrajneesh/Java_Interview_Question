package string;

public class PalindromeExample {
    // Function to check if a string is a palindrome
    public static int isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        // Continue looping while the two pointers
        // have not crossed
        while (left < right) {

            // If the characters at the current positions
            // are not equal
            if (s.charAt(left) != s.charAt(right))
                return 0;

            // Move the left pointer to the right and
            // the right pointer to the left
            left++;
            right--;
        }

        return 1;
    }
    public static void main(String[] args) {
        String s = "abbaii";
        System.out.println(isPalindrome(s));
    }
}
