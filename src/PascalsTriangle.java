import java.util.Scanner;
import java.util.*;

public class PascalsTriangle {
    public static void printPascal(int rows)
    {
        int[][] arr = new int[rows][rows];
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<=i; j++)
            {
                if(j == 0 || j == i)
                {
                    arr[i][j] = 1;
                }
                else
                {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        printPascal(rows);
    }
}
