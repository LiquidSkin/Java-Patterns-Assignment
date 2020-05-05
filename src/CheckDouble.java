import java.util.Scanner;
import java.util.*;

public class CheckDouble {
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two floating point numbers");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        d1 = Math.round(d1 * 100);
        d2 = Math.round(d2 * 100);
        d1 = d1 / 100;
        d2 = d2 / 100;
        if(d1 == d2)
        {
            System.out.println("These two floating point numbers are equal");
        }
        else
        {
            System.out.println("The floating point numbers are not equal");
        }

    }
}
