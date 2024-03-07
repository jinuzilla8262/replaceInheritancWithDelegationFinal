package org.example;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.EmptyStackException;
/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase
{
    public void testPush() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
        assertEquals(Integer.valueOf(2), stack.get(stack.size() - 1));
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
        assertTrue(stack.isEmpty());
    }
    public void testPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
        assertTrue(stack.isEmpty());
    }
    public void testPopEmptyStack() {
        MyStack<Integer> stack = new MyStack<>();
        try {
            stack.pop();
            fail("Expected EmptyStackException");
        } catch (EmptyStackException e) {
            // Expected
        }
    }
}