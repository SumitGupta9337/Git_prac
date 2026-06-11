import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class CollectionClass {
    public static void main (String args[])
    {
        Map<String, Integer > students =  new HashMap<>();
        students.put("Sumit", 56);
        students.put("Sanjana", 23);
        students.put("varad", 40);
        students.put("Piyush", 69);
        students.put("Piyush", 99);

        System.out.println(students.keySet());

        for(String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }

    
    }
}  