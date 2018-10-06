
import java.util.Random;
import java.util.*;
class RandomStringChooser
{
    ArrayList<String> temp;
    RandomStringChooser(String[] s)
    {
        temp=new ArrayList<String>();
        for (String a:s)
        {
            temp.add(a);
        }
    }
    String getNext()
    {
        String Rstring="None";
        for (int i=0;i<temp.size();i++)
        
        {
            Random random=new Random();
            int R=random.nextInt(temp.size());
            Rstring=temp.get(R);
            temp.remove(Rstring);
            return Rstring;
        }
        return Rstring;
    }
    public static void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number of words");
        int n=SC.nextInt();
        String[] wordArray = new String[n];
        System.out.println("Enter the words");
        for (int i=0;i<n;i++)
        {
            wordArray[i]=SC.next();
        }
        RandomStringChooser sChooser=new RandomStringChooser(wordArray);
        for (int k=0;k<n;k++)
        {
            System.out.println(sChooser.getNext() + " ");
        }
    }           
}