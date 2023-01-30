package exercises.technology;

public class Program {

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone(64, "Android", 12);
        System.out.println(myPhone.getNumPhotos());
        myPhone.takePhoto();
        System.out.println(myPhone.getNumPhotos());

        Laptop myLaptop = new Laptop(64,"macOs", 15, false,12);
        myLaptop.zoomCall();
    }



}
