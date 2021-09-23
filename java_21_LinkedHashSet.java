import java.util.*;
import java.util.LinkedHashSet;
class java_21_LinkedHashSet
{
 public static void main(String args[]){
 //Creating HashSet and adding elements
        LinkedHashSet<String> set=new LinkedHashSet<String>();
               set.add("Praveen");
               set.add("Radhika");
               set.add("Gogul");
               set.add("miya");
               set.add("Richu");
               Iterator<String> i=set.iterator();
               while(i.hasNext())
               {
               System.out.println(i.next());
               }
               System.out.println("Size of LinkedHashSet = " +set.size());
 }
}
