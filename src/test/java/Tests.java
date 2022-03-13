import FLF.FLF;
import Lights.SwitchType;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    private FLF flf;

    @BeforeEach
    public void setup(){
        flf = new FLF.Builder().build();
    }

    @Test
    @Order(1)
    public void task_01(){
        System.out.println("Wie sie sehen können, ist für task_01 eine Komponente erstellt.");
    }

    @Test
    @Order(2)
    public void task_02() throws Exception {
        flf.getxCentralUnit().execute(SwitchType.WARNLIGHT);
        assertTrue(flf.getxWarnLight()[0].isOn());
    }

}