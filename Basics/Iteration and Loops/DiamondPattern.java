/*
Sample Input Sample Output
n = 7 
      *
    *   *
   *      *
  *        *
   *      *
     *   *
       *

n = 5 
       *
     *   *
    *     *
     *   *
       *

*/

import java.util.*;
public class DiamondPattern{
    public static void main(String[] args) {

        //Scan Integer Value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print: ");
        int rows = sc.nextInt();
        int rowsSecond = (rows / 2);

        if(rows % 2 == 0){
            //If rows are even
            rows = (rows / 2);
            rowsSecond = (rows / 2);

        }else{
            //If rows are odd
            //Spliting the rows value into two, and adding one if rows are odd
            rows = (rows / 2) + 1;
            rowsSecond = (rows / 2) + 1;
        }

        //Print First Half of the Shape
        for(int i = 1; i <= rows; i++){ //Iterate through first half rows


            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("");
            } else {
                System.out.println("*");
            }
        }

        //Print Second Half of the Shape
        for (int i = rowsSecond; i >= 1; i--) {

            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            System.out.print("*");
            for (int k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }

            if (i == 1) {
                //If value of i is 1, then it is the only line
                System.out.println("");
            } else {
                //If i is not greater than 1, print * in new line.
                System.out.println("*");
            }

        }
    }
}
