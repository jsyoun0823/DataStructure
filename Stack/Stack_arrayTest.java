import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Stack_arrayTest {

    @Test
    public void pushSuccessTest() {
        Stack_array stackArray = new Stack_array(3);
        stackArray.push(5);
        assertEquals(5, stackArray.peek());
    }

    @Test
    public void pushFailedWhenStackIsFullTest() {
        Stack_array stackArray = new Stack_array(2);
        stackArray.push(3);
        stackArray.push(2);
//        int temp = stackArray.peek();
//        stackArray.push(1);
//        assertEquals(temp, stackArray.peek());

//        Executable
        assertThrows(IllegalStateException.class, () -> stackArray.push(1));
    }



}