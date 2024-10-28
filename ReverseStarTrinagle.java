Input: ‘N’ = 3

Output: 

*****
 ***
  *


code


  public class Solution {
        for(int i=n-1;i>=0;i--){
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
