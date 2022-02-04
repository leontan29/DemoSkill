import static org.junit.Assert.*;
import org.junit.*;

public class DemoSkillTest {
    @Test
    public void multiplication() {
        assertEquals(6, DemoSkill.multiply(4, 2)); //initially fails
    }
}
