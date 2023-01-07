package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        int miles = input.nextInt();
        System.out.println("Enter amount of gas used: ");
        int gasUsed = input.nextInt();

        int milesPerGallon = miles/gasUsed;

        System.out.println("The miles per gallon are: " + milesPerGallon);
    }
}
