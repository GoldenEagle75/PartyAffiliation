import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        String party = "";
        System.out.print("What is your political party affiliation? [R/D/I/Other] ");
        party = in.nextLine();
        party = party.toUpperCase();
       /* switch (party){ switch statement that we will not be using
            case "R":
                System.out.println("R");
                break;
            case "D":
                System.out.println("D");
                break;
            case "I":
                System.out.println("I");
            default:
                System.out.println("O");
        }; */
        if (party.equals("R")){
            System.out.println("You get a Republican Elephant.");
        }
        else if (party.equals("D")){
            System.out.println("You get a Democratic Donkey.");
        }
        else if (party.equals("I")){
            System.out.println("You get an Independent Man.");
        }
        else {
            System.out.println("You get an Other Otter.");
        }
    }
}