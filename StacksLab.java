
/**
 * StacksLab
 * 
 * @author Maggie Huang
 * @version 4/10/18
 */
import java.util.*;
public class StacksLab implements Stack
{
    private ArrayList<String> list;

    public StacksLab()
    {
        list = new ArrayList<String>();
    }

    public void push(String obj)
    {
        //will take in a String object and add it to the stack
        list.add(obj);
    }

    public String pop()
    {
        //return the String object at the top of the stack and remove it from the stack
        if(list.size() == 0)
            return "The stack is empty";
        else
        {
            String top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
    }

    public String peek()
    {
        //return the String object at the top of the stack but will not remove it from the stack
        if(list.size() == 0)
            return "The stack is empty";
        else
        {
            String top = list.get(list.size() - 1);
            return top;
        }
    }
}