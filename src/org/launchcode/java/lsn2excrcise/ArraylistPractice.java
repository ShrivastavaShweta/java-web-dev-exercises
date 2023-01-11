package org.launchcode.java.lsn2excrcise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraylistPractice {
    public static int sumEvenNums (ArrayList<Integer> arr) {
        int sum = 0;
        for (int i: arr){
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void printWords(ArrayList<String> wordlist, int length) {
        for (String word: wordlist){
            if (word.length() == length){
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(6);
        integerArrayList.add(7);
        integerArrayList.add(8);
        integerArrayList.add(9);
        integerArrayList.add(10);

        int sum = sumEvenNums(integerArrayList);
        System.out.println(sum);

        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
//        wordList.add("Add");
//        wordList.add("Hello");
//        wordList.add("Inspire");
//        wordList.add("volcano");
//        wordList.add("stamp");
//        wordList.add("start");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = input.nextInt();

        printWords(wordList, length);

        System.out.println(wordList.toString());


    }
}
