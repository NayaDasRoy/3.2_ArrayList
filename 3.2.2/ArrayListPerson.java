x`ximport java.util.ArrayList;

public class ArrayListPerson
{  
  public static void main(String[] args)
  { 
    ArrayList<Person> newList = new ArrayList<Person>();

    newList.add(new Person("Mike", 18, 750.00));
    newList.add(new Person("Sara", 21, 820.50));
    newList.add(new Person("Alex", 25, 910.75));
    // newList.add("My cousin");
    // This causes a compile-time error because ArrayList<Person> only accepts Person objects.
    // A String is not a Person, so Java does not allow it in this list.

    for (Person person : newList)
    {
      System.out.println(person.getName());
    }
  }
}

class Person
{
  private String name;
  private int age;
  private double salary;

  public Person(String name, int age, double salary)
  {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public double getSalary()
  {
    return salary;
  }
}