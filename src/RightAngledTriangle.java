import java.util.Scanner;
import java.util.*;

public class RightAngledTriangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int i = sc.nextInt();
        for(int rows=1; rows <=i; rows++)
        {
            for(int j=1; j<=rows; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
