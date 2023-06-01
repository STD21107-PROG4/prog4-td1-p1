package unit;

import com.hei.prog4.ClassSingleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class ClassSingletonTest {

    @Test
    void single_instance_monothread_ok(){
        ClassSingleton classSingleton1 = com.hei.prog4.ClassSingleton.getInstance();
        ClassSingleton classSingleton2 = com.hei.prog4.ClassSingleton.getInstance();
        assertEquals(classSingleton1.getDescription(),classSingleton2.getDescription());

        classSingleton1.setDescription("mod1");
        assertEquals(classSingleton1.getDescription(),classSingleton2.getDescription());

        classSingleton1.setDescription("mod2");
        classSingleton2.setDescription("mod3");
        assertEquals(classSingleton1.getDescription(),classSingleton2.getDescription());
    }
}
