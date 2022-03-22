import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PedometerManagerTest {
    @Test
    public void functionalTest() {
        PedometerManager data = new PedometerManager();
        data.add(1, 12);
        data.add(2, 8);
        data.add(3, 25);
        data.add(4, 32);
        data.add(5, 16);
        data.add(1, 21);
        data.add(3, -25);
        data.add(-3, 25);
        data.add(0, 25);
        data.add(5, 54);

        int expected = 71;
        int actual = data.add(1, 0);
        Assertions.assertEquals(expected, actual);
    }
}
