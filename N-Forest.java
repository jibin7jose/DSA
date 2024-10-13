
Input: ‘N’ = 3

Output: 
* * *
* * *
* * *


code
public class Solution {
    public static void nForest(int n) {
      
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println(); // Move to the next line
        }
    }
}
