Sample Input 1:
3
Sample Output 1:
* * * * * * 
* *     * * 
*         * 
*         * 
* *     * * 
* * * * * * 




  code

  public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        int spaces=0;
        int counter=n;
        for(int i=1;i<=n;i++){
            for(int j=0;j<counter;j++)
                System.out.printf("* ");
            for(int j=0;j<spaces;j++)
            System.out.printf(" ");
        
        for(int j=0;j<counter;j++)
        System.out.printf("* ");
        System.out.println();
        spaces +=4;
        counter -=1;
        }
    spaces -=4;
    counter +=1;

    for(int i=n-1;i>=0;i--){
            for(int j=0;j<counter;j++)
                System.out.printf("* ");
            for(int j=0;j<spaces;j++)
            System.out.printf(" ");
        
        for(int j=0;j<counter;j++)
        System.out.printf("* ");
        System.out.println();
    
         spaces-=4;
         counter+=1;
    }
}
}
