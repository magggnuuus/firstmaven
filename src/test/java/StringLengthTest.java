import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringLengthTest {

    @Test
    public void StringLength(){
        String test2= "donaudampffschifffahrtgesellschaft";
        boolean truthTest= StringLength.checkStringLength(test2);
        Assertions.assertEquals(true, truthTest);

    }

}
