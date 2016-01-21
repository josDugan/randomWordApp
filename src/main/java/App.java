import java.util.Date;

/**
 * Created by joseph on 1/19/16.
 */
public class App {

    public static void main(String[] arguments) {



        System.out.println("This program allows you to generate a list of random words beginning with letter of your choice");
        Request request = new Request();
        ListOfWords output = new ListOfWords(request);
        output.printList();


    }
}
