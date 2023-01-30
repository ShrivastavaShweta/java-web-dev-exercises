package exercises.technology;

public class Computer extends AbstractEntity {
    private String typeOfMonitor;
    private int ram;
    private String operatingSystem;


    public Computer(int ram, String operatingSystem){
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    public void setTypeOfMonitor(String typeOfMonitor) {
        this.typeOfMonitor = typeOfMonitor;
    }

    public String getTypeOfMonitor() {
        return typeOfMonitor;
    }

    public int getRam() {
        return ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void changeRam(int moreRam){
        this.ram += moreRam;
    }

    public void useApplications(){
        System.out.println("Clicked and opened different applications to use.");
    }

    public void powerOn(){
        System.out.println("Pressed power button to turn it on.");
    }
}
