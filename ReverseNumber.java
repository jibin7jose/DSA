Input: ‘N’ = 3

Output: 

1 2 3
1 2
1



code

public class Solution {
    public static void nNumberTriangle(int n) {
         for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                
                System.out.printf("%d ",n-j+1);
            }
            System.out.println();
        }
    }
}
   
