package Array;

public class ReverseArrayString {
	
    // Approach 1: Two Pointer (Most Optimized - O(n) time, O(1) space)
    public static String reverseStringOptimized(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        return new String(arr);
    }
    
    // Approach 2: Using StringBuilder (O(n) time, O(n) space)
    public static String reverseStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    
    // Approach 3: Recursive (O(n) time, O(n) space due to call stack)
    public static String reverseStringRecursive(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverseStringRecursive(s.substring(1)) + s.charAt(0);
    }
    
    public static void main(String[] args) {
        // Test cases
        String test1 = "Geeks";
        String test2 = "for";
        String test3 = "a";
        
        System.out.println("Using Two Pointer Approach (Most Optimized):");
        System.out.println("Input: " + test1 + " -> Output: " + reverseStringOptimized(test1));
        System.out.println("Input: " + test2 + " -> Output: " + reverseStringOptimized(test2));
        System.out.println("Input: " + test3 + " -> Output: " + reverseStringOptimized(test3));
        
        System.out.println("\nUsing StringBuilder:");
        System.out.println("Input: " + test1 + " -> Output: " + reverseStringBuilder(test1));
        
        System.out.println("\nUsing Recursion:");
        System.out.println("Input: " + test1 + " -> Output: " + reverseStringRecursive(test1));
    }
}
