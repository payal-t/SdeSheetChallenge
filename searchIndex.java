package Arrays;

import java.util.Scanner;

public class searchIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        System.out.println("Enter the number of rows and cols:");

        //declaring the 2d array
        int[][] nums=new int[rows][cols];

        //input
        //taking inputs by declaring nested loops ie;outer for loops and inner for loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                nums[i][j]=sc.nextInt();
            }
        }

        int x=sc.nextInt();
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                //compare with x
                if(nums[i][j]==x)
                {
                    System.out.println("x found at position (" +i +","+j +")");
                }
            }
            
        }
    }
}
