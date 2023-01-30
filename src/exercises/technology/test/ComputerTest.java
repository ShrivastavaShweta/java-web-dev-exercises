package exercises.technology.test;

import exercises.technology.Computer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComputerTest {
    Computer newComputer;
    @Before
    public void setUp() throws Exception {
       newComputer = new Computer(64, "macOS");
    }

    @Test
    public void correctRam(){
        String spec = "Constructor sets the correct value of ram";
        int expected = 64;
        int actual = newComputer.getRam();
        assertEquals(spec, expected, actual);
    }
    @Test
    public void correctOS(){
        String spec = "Constructor sets the correct value of OS";
        String expected = "macOS";
        String actual = newComputer.getOperatingSystem();
        assertEquals(spec, expected, actual);
    }

    @Test
    public void correctMonitorType(){
        String spec = "Setter sets the correct value for type of monitor";
        newComputer.setTypeOfMonitor("OLED monitor");
        String expected = "OLED monitor";
        String actual = newComputer.getTypeOfMonitor();
        assertEquals(spec, expected, actual);
    }
}
