import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
    @Test
    public void testSize() {
        Stack myStack = new Stack(5);
        assertEquals(5, myStack.size());
    }

    @Test
    public void testPush() {
        Stack myStack = new Stack(1);
        myStack.push(3);
        assertEquals(3, myStack.top());
        myStack.push(6);
        assertEquals(3, myStack.top());
    }

    @Test
    public void testIsEmpty() {
        Stack myStack = new Stack(4);
        assertEquals(true, myStack.isEmpty());
        myStack.push(3);
        assertEquals(false, myStack.isEmpty());
    }

    @Test
    public void testPop() {
        Stack myStack = new Stack(4);
        assertEquals(-1, myStack.pop());
        myStack.push(3);
        myStack.push(5);
        myStack.print();
        assertEquals(5, myStack.pop());
        myStack.print();
    }
}
