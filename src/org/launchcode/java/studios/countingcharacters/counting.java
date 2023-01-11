package org.launchcode.java.studios.countingcharacters;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class counting {

    public static void main(String[] args) {
//        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms " +
//                "has to be zero to start with. So if you move all the terms over to one side, " +
//                "you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
//                "Once you’ve done that, it’s pretty straightforward from there.";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sentence = input.nextLine();

        char[] charactersInString = sentence.toLowerCase().toCharArray();

        //System.out.println(charactersInString);

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char character: charactersInString){
            if (charCount.containsKey(character) && Character.isAlphabetic(character)){
                charCount.put(character, charCount.get(character) + 1);
            } else if (Character.isAlphabetic(character)){
                charCount.put(character,1);
            }
        }

        //System.out.println(charCount);

        for (Map.Entry<Character, Integer> entry: charCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        File file = new File("/Users/SaurabhPrakash/Desktop/Shweta/Learning/java_practice/chapter-one/test.txt");


        try {

            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;

            while ((st = br.readLine()) != null) {
                System.out.println(st);
                char[] newCharArray = st.toLowerCase().toCharArray();
                HashMap<Character, Integer> charArrayCount = new HashMap<>();

                for (char character: newCharArray){
                    if (charArrayCount.containsKey(character) && Character.isAlphabetic(character)){
                        charArrayCount.put(character, charArrayCount.get(character) + 1);
                    } else if (Character.isAlphabetic(character)){
                        charArrayCount.put(character,1);
                    }
                }

                for (Map.Entry<Character, Integer> entry: charArrayCount.entrySet()){
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }

        } catch (FileNotFoundException e){

            System.out.println("File not found on the given location");

        } catch (IOException exception) {

            System.out.println("Input output exception occured");
        }





    }
}
