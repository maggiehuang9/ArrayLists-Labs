/**
 * IndexEntry
 *
 * @author Maggie Huang
 * @version 4/12/18
 */
import java.util.ArrayList;

public class IndexEntry
{
    private String word;
    private ArrayList<Integer> numsList;


    // Constructs an IndexEntry for a given word
    // (converted to upper case); sets numsList
    // to an empty ArrayList.
    public IndexEntry(String word)
    {
        this.word = word.toUpperCase();  // convert to update case
        numsList = new ArrayList<Integer>();
    }


    // Returns the word of this IndexEntry object.
    public String getWord()
    {
        return word;
    }


    // If num is not already in the list, adds num
    // at the end of this IndexEntry's list
    // of numbers.  If num is there, do nothing.
    public void add(int num)
    {
        if (!numsList.contains(num))
            numsList.add(num);
    }

    // Converts this IndexEntry into a string in the
    // following format: the word followed by a space, followed by
    // numbers separated by a comma and a space.
    public String toString()
    {
        String str = this.word;
        if (!numsList.isEmpty())
            str += " "+numsList.get(0);  // add first line number
        
        for (int i=1; i<numsList.size(); i++) 
            str += ", "+numsList.get(i); // add rest of line numbers
        
        return str;
    }
}
