/**
 * Compression
 *
 * @author Maggie Huang
 * @version 4/12/18
 */
import java.util.*;

public class Compression {
   
   public String compress(int[] numberList)
   {
       //take in an array of integers (all single-digit) and produce a String
       String str="";
       int num = numberList[0];
       int count = 0; // counter
       for (int i=0; i<numberList.length; i++)
       {
           if (numberList[i]!=num) // if number change
           {
               str += "["+count+"]"+num; // add the string for this number
               num = numberList[i];  // update the new number
               count = 1; // reset the counter
           } else {
               count ++;
           }
       }
       
       if (count==0)  // if the last number is not duplicate one
       {
           str += "[1]"+num;
       } else  // if the last number is duplicate one
       {
           str += "["+count+"]"+num; // add the string
       }
       
       return str;
   }
   
   public int[] expand (String numberList)
   {
       //will take in the encoded data (the String representation of the number list) and return the corresponding array of integers
       ArrayList<Integer> list = new ArrayList<Integer>();
       
       int left_bracket_pos = 0;
       int right_bracket_pos = 0;
       int digit = 0;
       
       for (int i=0; i<numberList.length(); i++)
       {
           if (numberList.charAt(i)=='[') {
               if (right_bracket_pos>0) {
                   int number_of_digit = Integer.parseInt(numberList.substring(left_bracket_pos+1, right_bracket_pos));
                   for (int j=0; j<number_of_digit; j++)
                       list.add(digit);
               }
               left_bracket_pos = i;
           } else if (numberList.charAt(i)==']') {
               right_bracket_pos = i;
           } else {
               digit = Character.getNumericValue(numberList.charAt(i));
           }
       }
       
       // write last sets of digits
       int number_of_digit = Integer.parseInt(numberList.substring(left_bracket_pos+1, right_bracket_pos));
       for (int j=0; j<number_of_digit; j++)
                       list.add(digit);
       
       int [] arr = new int[list.size()];
       
       for (int i=0; i<list.size(); i++)
           arr[i] = list.get(i);
      
       return arr;
       
   }
 
}
