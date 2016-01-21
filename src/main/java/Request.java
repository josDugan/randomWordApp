import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joseph on 1/19/16.
 */
public class Request {
    private final static int LOWER_BOUND = 1;

    public Request() {
        listSize = promptUserForListSize();
        lettersArray = promptUserForLettersArray();
        sort = promptUserForSortOption();
    }

    private static int promptUserForListSize() {
        System.out.println("How many words do you want to generate?");
        Scanner in = new Scanner(System.in);
        int listLength = 0;

        if (in.hasNextInt()) {
            int userInput;
            boolean invalidUI = false;


            do {
                userInput = in.nextInt();
                invalidUI = userInput < LOWER_BOUND;

                if (invalidUI) {
                    System.out.println("Input is not a positive number. Please enter a positive number.");
                }
            }
            while (invalidUI);

            listLength = userInput;
        }
        else {
            System.out.println("Please enter a positive number");
            promptUserForListSize();
        }

        return listLength;

    }

    private static ArrayList<Character> promptUserForLettersArray() {
        ArrayList<Character> leadingLetters = new ArrayList<Character>();

        System.out.println("Please enter the letters you would like to begin your words.");
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            char inputItem = in.next().charAt(0);
            if (Character.isLetter(inputItem)) {
                leadingLetters.add(inputItem);
            }
            else {
                break;
            }
        }
        System.out.println(leadingLetters);
        return leadingLetters;
    }

    private static boolean promptUserForSortOption() {
        System.out.println("Do you want an alphabetized list? Enter 1 for yes.");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int code = in.nextInt();
            if (code == 1) {
                return true;
            }
        }
        return false;
    }

    // helper method initializes the listSIze in the constructor
    public int getListSize() {

        return listSize;
    }

    public ArrayList<Character> getLettersArray() {

        return lettersArray;
    }

    public boolean getSort() {

        return sort;
    }

    private int listSize;
    private ArrayList<Character> lettersArray;
    private boolean sort;
}
