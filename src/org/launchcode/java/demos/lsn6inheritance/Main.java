package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args){
        HouseCat myCat = new HouseCat("Oscar", 12);
        myCat.eat();
        System.out.println(myCat.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());
    }

}
