package org.launchcode.java.lsn2excrcise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("Enter students (or press Enter to finish): ");
        do {
            System.out.println("Enter student name: ");
            name = input.nextLine();

            if (! name.equals(" ")){
                System.out.println("Enter ID: ");
                int id = input.nextInt();
                students.put(id, name);
                input.nextLine();
            }
        } while (! name.equals(""));

        System.out.println("Class Roster: ");

        for (Map.Entry<Integer, String> student: students.entrySet()){
            System.out.println(student.getKey() + student.getValue());
        }
    }
}
