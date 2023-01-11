package org.launchcode.java.lsn2excrcise;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] myArray = {1, 1, 2, 3, 5, 8};

        for (int i: myArray){
            System.out.println("The number in array is "+i);
            if (i % 2 == 1){
                System.out.println("The number " + i + " is odd");
            }

        }

        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] newArray = sentence.split("\\.");
        System.out.println(Arrays.toString(newArray));

    }


}
