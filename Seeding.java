Input: ‘N’ = 3

Output: 
* * *
* *
*


  code

public class Solution {
    public static void seeding(int n) {
        // Write your code here
        int i,j;
           for ( i = 0; i <= n; i++) {
            for ( j = n; j > i; j--) {
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println(); // Move to the next line
        }
    }
}  

