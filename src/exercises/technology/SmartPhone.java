package exercises.technology;

import java.util.Scanner;

public class SmartPhone extends Computer{
    private Scanner input;
    private int numPhotos;

    public SmartPhone(int ram, String operatingSystem, int numPhotos) {
        super(ram, operatingSystem);
        this.numPhotos = numPhotos;
    }

    public void takePhoto(){
        this.numPhotos ++;
    }

    public int getNumPhotos() {
        return numPhotos;
    }

    @Override
    public void powerOn() {
        System.out.println("Please select if you want to restart, poweroff or cancel");
        String answer = input.nextLine();
        if(answer.toLowerCase() == "restart"){
            System.out.println("Restarting phone now");
        } else if (answer.toLowerCase()== "poweroff"){
            System.out.println("Powering off!");
        }else if (answer.toLowerCase()=="cancel"){
            System.out.println("Going back to main menu");
        }
    }
}
