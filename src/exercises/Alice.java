package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search in the sentence: ");
        String termToSearch = input.nextLine();

        if (sentence.toLowerCase().contains(termToSearch.toLowerCase())) {
            System.out.println("Your term " + termToSearch + " is in the sentence ");
            System.out.println("Length of your term to search is: " + termToSearch.length());
            System.out.println("The term is at index: " + sentence.toLowerCase().indexOf(termToSearch.toLowerCase()));
            String newSentence = sentence.replace(termToSearch , "");
            System.out.println(sentence);
            System.out.println(newSentence);
        } else {
            System.out.println("Your term " + termToSearch + " is not in the sentence ");
        }
    }
}
