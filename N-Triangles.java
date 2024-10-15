Input: ‘N’ = 3

Output: 
1
1 2 
1 2 3


  code


  public class Solution {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++)
            {
                System.out.printf("%d ",j+1);
            }
            System.out.println();
        }
    }
}
