/**
 * Unit8Tester
 *
 * @author Maggie Huang
 * @version 4/12/18
 */
import java.io.*;//IOException;

public class Unit8Tester extends junit.framework.TestCase {
   public static void main(String[] args) throws IOException
   {
       int [] aa = {1,1,1,3,2,2,3,3,3,44,44,5,5};
       Compression c = new Compression();
       
       String str = c.compress(aa);
       System.out.println("list= "+str);
       
       int [] bb = c.expand(str);
       
       for (int i=0; i<aa.length; i++)
       {
          System.out.print(aa[i]+" ");
       }
       
       System.out.println();
       
       IndexMaker im = new IndexMaker();
       assertEquals("A 12, 14, 15", im.getIndexLine(0));
       im.showIndex();
       
   } 
}
