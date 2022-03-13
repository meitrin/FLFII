import FLF.*;
import Lights.Switch;
import Lights.SwitchType;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class Tests {
    private FLF flf;

    @BeforeEach
    public void setup(){
        flf = new FLF.Builder().build();
    }

    @Test
    @Order(1)
    public void task_01(){
        System.out.println("Wie Sie sehen koennen, ist fuer task_01 eine Komponente erstellt.");
    }

    @Test
    @Order(2)
    public void task_02() throws Exception{
        flf.getxCentralUnit().execute(SwitchType.WARNLIGHT);
        assertTrue(flf.getxWarnLight()[0].isOn());
    }

    @Test
    @Order(3)
    public void task_03(){
        System.out.println("Wie sollen wir das hier überprüfen mit einem Test?");
    }

    @Test
    @Order(4)
    public void task_04(){

    }

    @Test
    @Order(5)
    public void task_05(){

    }

    @Test
    @Order(6)
    public void task_06(){
        Switch switch = new Switch(SwitchType.WARNLIGHT);

    }

    @Test
    @Order(7)
    public void task_07(){

    }

    @Test
    @Order(8)
    public void task_08(){

    }

    @Test
    @Order(9)
    public void task_09(){

    }
}