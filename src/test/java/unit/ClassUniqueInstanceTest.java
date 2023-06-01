package unit;

import com.hei.prog4.ClassUniqueInstance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassUniqueInstanceTest {

    @Test
    void single_instance_monothread_ok(){

        ClassUniqueInstance classUniqueInstance1 = ClassUniqueInstance.INSTANCE;
        ClassUniqueInstance classUniqueInstance2 = ClassUniqueInstance.INSTANCE;
        assertEquals(classUniqueInstance1.getClick(),classUniqueInstance2.getClick());

        classUniqueInstance1.setClick(2);
        assertEquals(classUniqueInstance1.getClick(),classUniqueInstance2.getClick());

        classUniqueInstance1.setClick(3);
        classUniqueInstance2.setClick(4);
        assertEquals(classUniqueInstance1.getClick(),classUniqueInstance2.getClick());

    }
}
