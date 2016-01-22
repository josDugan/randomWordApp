import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by joseph on 1/19/16.
 */
public class ListOfWords {

    public ListOfWords(Request listData) {
        outList = generateList(listData);
    }

    private static ArrayList<String> generateList(Request listData) {
        int listSize = listData.getListSize();
        ArrayList<Character> leadingLetters = listData.getLettersArray();
        int leadingLettersSize = leadingLetters.size();

        ArrayList<String> listMembers = new ArrayList<String>();

        for (int i = leadingLettersSize; i < listSize + leadingLettersSize; i++) {
            int indexToPass = i % leadingLettersSize;
            char leadLetter = leadingLetters.get(indexToPass);
            String word = new Word(leadLetter).getRandomWord();
            listMembers.add(word);
        }

        // sorting logic
        boolean sortThis = listData.getSort();
        if (sortThis) {
            Collections.sort(listMembers);
        }

        return listMembers;
    }




    private ArrayList<String> outList;

    public void printList() {
        for (String word: outList) {
            System.out.println(word);
        }
    }




}
