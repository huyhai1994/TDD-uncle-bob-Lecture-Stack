import org.junit.Before;
import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;


public class StackTest {
    private Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack();
    }

    @Test
    public void newStack_isEmpty() throws Exception {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterOnePush_IsNotEmpty() throws Exception {
        stack.push(0);
        assertFalse(stack.isEmpty());
    }

    @Test(expected = Stack.Underflow.class)
    public void willThrowUnderFlow_WhenEmptyStackIsPopped() throws Exception {
        stack.pop();
    }

    @Test
    public void afterOnePushAndOnePopped_WillBeEmpty() throws Exception {
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterTwoPushAndTwoPopped_WillNotBeEmpty() throws Exception {
        stack.push(0);
        stack.push(1);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterPushingX_WillPopX() throws Exception {
        stack.push(99);
        assertEquals(99, stack.pop());
        stack.push(88);
        assertEquals(88, stack.pop());
    }


}
