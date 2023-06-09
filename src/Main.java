import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String partyAffiliation = " ";

        System.out.println("Enter your party affiliation as D for Democrat, R for Republican, I for Independent, or O for Other: ");
        partyAffiliation = in.nextLine();

        if(partyAffiliation.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if(partyAffiliation.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Donkey.");
        }
        else if(partyAffiliation.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person.");
        }
        else if(partyAffiliation.equalsIgnoreCase("O"))
        {
            System.out.println("You get an Other");
        }
    }
}