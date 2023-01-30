package exercises.technology.test;

import exercises.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {
    SmartPhone myPhone;

    @Before
    public void createTestData(){
        myPhone = new SmartPhone(64, "kitkat", 15);
    }

    @Test
    public void correctRam(){
        String spec = "Super constructor correctly sets the value of ram";
        int expected = 64;
        int actual = myPhone.getRam();
        assertEquals(spec, expected, actual);
    }

    @Test
    public void correctOS(){
        String spec = "Super constructor correctly sets the value of OS";
        String  expected = "kitkat";
        String actual = myPhone.getOperatingSystem();
        assertEquals(spec, expected, actual);
    }

    @Test
    public void takePhotoUpdatesCorrectly(){
        String spec = "takePhoto method upadtes number of photos correctly";
        myPhone.takePhoto();
        int expected = 16;
        int actual = myPhone.getNumPhotos();
        assertEquals(spec,expected, actual);
    }
}
