/**
 * HappyNumbers
 *
 * @author Maggie Huang
 * @version 4/12/18
 */
import java.util.*;

public class HappyNumbers 
{
    
    public static void main (String[] args)
    {
        int n = 1211;
        System.out.println("sum_square("+ n +") = "+sumOfSquaresOfDigits(n));
        System.out.println("isHappy("+ n +") = "+isHappy(n));
        System.out.println("done");
    }
    
    public static boolean isHappy(int n)
    {
        //takes in an int and returns true if it is a happy number
        ArrayList<Integer> list = new ArrayList<Integer>();
        int m = n;
        list.add(m);
        while (true)
        {
            m = sumOfSquaresOfDigits(m);
            if (m==1) return true;
            if (list.contains(m)) return false;
            list.add(m);
        }
    }
    
    public static int sumOfSquaresOfDigits(int n)
    {
        //squares each digit in a number and adds them together
        int sum = 0;
        int k = n;
        while (k>0)
        {
            int i = k%10;
            sum += i*i;
            k = k/10;
        }
        return sum;
    }
}
