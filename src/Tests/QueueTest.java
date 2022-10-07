import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {
    @Test
    public void testEmpty() {
        Queue myQueue = new Queue(20);
        assertEquals(true, myQueue.isEmpty());
        myQueue.enqueue(2);
        assertEquals(false, myQueue.isEmpty());
    }

    @Test
    public void testSize() {
        Queue myQueue = new Queue(20);
        assertEquals(0, myQueue.getSize());
        myQueue.enqueue(3);
        assertEquals(1, myQueue.getSize());
    }

    @Test
    public void testFront() {
        Queue myQueue = new Queue(20);
        myQueue.enqueue(3);
        assertEquals(3, myQueue.getFront());
    }

    @Test
    public void testEnqueue() {
        Queue myQueue = new Queue(3);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        assertEquals(0, myQueue.enqueue(6));
    }

    @Test
    public void testDequeue() {
        Queue myQueue = new Queue(20);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.dequeue();
        assertEquals(4, myQueue.dequeue());
        assertEquals(0, myQueue.getSize());
        assertEquals(0, myQueue.dequeue());
    }
}
// Dummy commit
