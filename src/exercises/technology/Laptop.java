package exercises.technology;

public class Laptop extends Computer{

    private int screenSize;
    private boolean isTouchScreen;

    private int cameraPixels;
    public Laptop(int ram, String operatingSystem, int screenSize, boolean isTouchScreen, int cameraPixels) {
        super(ram, operatingSystem);
        this.screenSize = screenSize;
        this.isTouchScreen = isTouchScreen;
        this.cameraPixels = cameraPixels;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        isTouchScreen = touchScreen;
    }

    public int getCameraPixels() {
        return cameraPixels;
    }

    public void setCameraPixels(int cameraPixels) {
        this.cameraPixels = cameraPixels;
    }

    public void zoomCall(){
        System.out.println("Used the system microphone and camera to make zoom call.");
    }

    @Override
    public void useApplications() {
        System.out.println("Please Download the app you want to use then tap on it");
    }
}
