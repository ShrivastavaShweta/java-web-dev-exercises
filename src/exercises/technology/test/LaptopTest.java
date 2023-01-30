package exercises.technology.test;

import exercises.technology.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    Laptop myLaptop;

    @Before
    public void createTestData(){
        myLaptop = new Laptop(128,"MacOs Movaje", 15, true, 15);
    }

    @Test
    public void correctRam(){
        String spec = "Super constructor correctly sets the value of ram";
        int expected = 128;
        int actual = myLaptop.getRam();
        assertEquals(spec, expected, actual);
    }

    @Test
    public void correctOS(){
        String spec = "Super constructor correctly sets the value of OS";
        String  expected = "MacOs Movaje";
        String actual = myLaptop.getOperatingSystem();
        assertEquals(spec, expected, actual);
    }

    @Test
    public void correctIsTouchScreen(){
        String spec = "Constructor correctly sets the value of isTouchScreen";
        boolean expected = true;
        boolean actual = myLaptop.isTouchScreen();
        assertEquals(spec,expected, actual);
    }
}
