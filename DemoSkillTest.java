import static org.junit.Assert.*;
import org.junit.*;

public class DemoSkillTest {
    @Test
    public void multiplication() {
        assertEquals(6, DemoSkill.multiply(3, 2)); //initially fails
    }
}
