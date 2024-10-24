import java.util.LinkedList;
import java.util.Collection;

public class CollectionPractical1{
  public static void main(String[]args){
  Collection<Integer> c = new LinkedList<>();
        c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
        c.add(50);
		c.remove(40);
		
		 System.out.println("Is the collection empty?" + c.isEmpty());
		 
		 System.out.println("Size of the collection: " + c.size());
		 
		int elementToCheck = 30;
        System.out.println("Does the collection contain " + elementToCheck + "? " + c.contains(elementToCheck));
        
		 System.out.println("Elements in the collection after removal: " + c);
    }
}
