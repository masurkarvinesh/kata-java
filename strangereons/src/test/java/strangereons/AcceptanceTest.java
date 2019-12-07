package strangereons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AcceptanceTest {
    @Test
    public void canaryTest() throws Exception {
        UI ui = new UI(new Application());
        assertEquals("Leeted: S3cr3t", ui.leetMessage("Secret"));
    }
}