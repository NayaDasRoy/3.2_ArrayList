import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> animalList = new ArrayList<String>();

        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("Rabbit");

        String command = "";

        while (!command.equals("q"))
        {
            System.out.println(displayList(animalList));
            System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace or (q)uit?");
            command = input.nextLine().trim().toLowerCase();

            if (command.equals("a"))
            {
                System.out.println("Enter an animal:");
                String animal = input.nextLine();
                animalList.add(animal);
                System.out.println(displayList(animalList));
            }
            else if (command.equals("i"))
            {
                System.out.println("Enter an animal:");
                String animal = input.nextLine();
                System.out.println("Enter a position:");
                String posText = input.nextLine().trim();

                try
                {
                    int userPos = Integer.parseInt(posText);
                    int pos = userPos - 1;
                    if (userPos < 1 || userPos > animalList.size() + 1)
                    {
                        System.out.println("Bad position!");
                    }
                    else
                    {
                        animalList.add(pos, animal);
                        System.out.println(displayList(animalList));
                    }
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Bad position!");
                }
            }
            else if (command.equals("r"))
            {
                System.out.println("Enter a position:");
                String posText = input.nextLine().trim();

                try
                {
                    int userPos = Integer.parseInt(posText);
                    int pos = userPos - 1;
                    if (userPos < 1 || userPos > animalList.size())
                    {
                        System.out.println("Bad position!");
                    }
                    else
                    {
                        animalList.remove(pos);
                        System.out.println(displayList(animalList));
                    }
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Bad position!");
                }
            }
            else if (command.equals("p"))
            {
                System.out.println("Enter an animal:");
                String animal = input.nextLine();
                System.out.println("Enter a position:");
                String posText = input.nextLine().trim();

                try
                {
                    int userPos = Integer.parseInt(posText);
                    int pos = userPos - 1;
                    if (userPos < 1 || userPos > animalList.size())
                    {
                        System.out.println("Bad position!");
                    }
                    else
                    {
                        animalList.set(pos, animal);
                        System.out.println(displayList(animalList));
                    }
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Bad position!");
                }
            }
            else if (command.equals("q"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid command!");
            }
        }

        input.close();
    }

    public static String displayList(ArrayList<String> list)
    {
        String result = "[";
        for (int i = 0; i < list.size(); i++)
        {
            if (i > 0)
            {
                result += ", ";
            }
            result += list.get(i);
        }
        result += "]";
        return result;
    }
}
