
/**
 * QueuesLab
 * 
 * @author Maggie Huang 
 * @version 4/10/18
 */
import java.util.*;
public class QueuesLab implements Queue
{
    private ArrayList<String> list;

    public QueuesLab()
    {
        list = new ArrayList<String>();
    }

    public void addToQueue(String obj)
    {
        //take in a String object and add it to the list.
        list.add(obj);

    }

    public String removeFromQueue()
    {
        //return the String object at the front of the list and remove it from the list
        if(list.size() == 0)
            return "The queue is empty.";
        else
        {
            String front = list.get(0);
            list.remove(0);
            return front;
        }
    }

    public void addVIPToQueue(String obj)
    {
        //take in a String object and add it to the front of the list
        list.add(0, obj);
    }

    public void printList()
    {
        //use a "for each" loop to print every element in the list
        for(String str : list)
            System.out.println(str);
    }
}