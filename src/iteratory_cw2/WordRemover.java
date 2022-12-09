package iteratory_cw2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class WordRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HOW_MANY_WORDS = 5;

        List<String> wordsList = new ArrayList<>();

        for (int i = 0; i < HOW_MANY_WORDS; i++) {
            System.out.println("Podaj wyraz nr " + (i + 1)) ;
            String word = scanner.nextLine();
            wordsList.add(word);
        }

        System.out.println("Jakie słowo klucz ma posłużyć do filtrowania?");
        String key = scanner.nextLine();

        Iterator<String> iterator = wordsList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().toLowerCase().contains(key.toLowerCase()))
                iterator.remove();
        }


        System.out.println(wordsList);
    }
}
