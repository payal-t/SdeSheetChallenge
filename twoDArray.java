package Arrays;

import java.util.Scanner;

public class twoDArray {

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
        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(nums[i][j]+ " ");
                //System.out.print("Required matrix is as follows");
            }

            System.out.println();
        }



    }


}
