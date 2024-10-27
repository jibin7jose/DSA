Input: ‘N’ = 3

Output: 

  *
 ***
*****


code

public class Solution {
    public static void nStarTriangle(int n) {
        for(int i=0;i<n;i++){
            int space=n-i-1;
            for(int j=0;j<space;j++){
                System.out.printf(" ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.printf("*");
            }
             for(int j=0;j<space;j++){
                System.out.printf(" ");
        }
        System.out.println();
        }
    }
}
