/*
 * Activity 3.2.3
 */
import java.util.ArrayList;

public class ArrayListExample
{  
   public static void main(String[] args)
   {  
      ArrayList<String> animalList = new ArrayList<String>();  
      animalList.add("Dog");
      animalList.add("Cat");
      animalList.add("Rabbit");
      animalList.add("Frog");
      animalList.add("Horse");
      animalList.add("Cow");
      
      // display list
      System.out.println(animalList);

      animalList.add("Bird");
      animalList.add(4, "Snake");

      System.out.println("Third item: " + animalList.get(2));
      System.out.println("Fourth item: " + animalList.get(3));

      animalList.remove("Frog");

      System.out.println("Final list: " + animalList);
      System.out.println("Size: " + animalList.size());
   }  
}