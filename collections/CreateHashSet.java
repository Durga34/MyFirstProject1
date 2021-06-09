package collections;
import java.util.HashSet;
import java.util.*;
 
public class CreateHashSet {
    public static void main(String[] args) {
       
        Set<String> hash = new HashSet<>();
 
       
        hash.add("Big Data");
        hash.add("Node.js");
        hash.add("Java");
        hash.add("Python");
        hash.add("Blockchain");
        hash.add("JavaScript");
        hash.add("Selenium");
        hash.add("AWS");
        hash.add("Machine Learning");
        hash.add("RPA");
         
 
        
        hash.add("Java");
        hash.add("RPA");
 
        System.out.println(hash);
         
        
        String myCourse = "Node.js";
        if(hash.contains(myCourse)) {
            System.out.println(myCourse + " is in the courses list.");
        } else {
            System.out.println(myCourse + " is not in the courses list.");
        }
         
        
        List<String> list = new ArrayList<String>(hash); 
        Collections.sort(list); 
   
       
        System.out.println("Printing the Courses in sorted order using List: " + list);
         
    
        hash.remove("Python"); 
           
       
        System.out.println("Iterating over course list after removing Python:"); 
        Iterator<String> i = hash.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
         
         
        
        HashSet<String> hash1 = new HashSet<String>(); 
        hash1.add("Node.js"); 
        hash1.add("Python");
        hash1.add("Machine Learning");
                       
        hash.removeAll(hash1);  
        System.out.println("After invoking removeAll() method courses left: " + hash); 
         
    
        hash.removeIf(str->str.contains("Java"));    
        System.out.println("After invoking removeIf() method: "+ hash);  
         
       
        hash.retainAll(hash1);
        System.out.println("HashSet after " + "retainAll() operation : " + hash1); 
         
        hash.clear();  
        System.out.println("After invoking clear() method: "+ hash); 
        
    }
}
