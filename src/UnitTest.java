import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {

/** testing linked list implementation
 * testing isEmpty, enqueue, size, dequeue, throwing error on dequeue on empty queue
 */
    @Test
    public void testLinkedQueue() {
        IQueue queue = new LinkedListQueue();
        assertTrue(queue.isEmpty());
        queue.enqueue(10);
        assertEquals(1, queue.size());
        assertEquals(10, queue.dequeue());
        assertTrue(queue.isEmpty());
        assertThrows(RuntimeException.class, queue::dequeue);
    }

    /** testing array implementation
     * testing enqueue, size, dequeue, toString
     */
    @Test
    public void testArrayQueue() {
        IQueue queue = new ArrayQueue(3);
        queue.enqueue("A");
        queue.enqueue("B");
        assertEquals(2, queue.size());
        assertEquals("A", queue.dequeue());
        assertEquals("B", queue.dequeue());
        assertEquals("[]", queue.toString());
    }
}