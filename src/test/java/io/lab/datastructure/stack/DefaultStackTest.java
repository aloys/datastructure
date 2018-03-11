package io.lab.datastructure.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amazimpaka on 2018-03-10
 */
public class DefaultStackTest {

    private final  Stack<Integer> stack = new DefaultStack<>();

    @Test
    public void push() {
        stack.push(10);
        Assert.assertEquals(1, stack.getSize());

        stack.push(20);
        Assert.assertEquals(2, stack.getSize());

        stack.push(30);
        Assert.assertEquals(3, stack.getSize());

        stack.display();
    }

    @Test
    public void pop() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        Assert.assertEquals(5, stack.getSize());
        stack.display();

        Assert.assertEquals(50, (int)stack.pop().getData());
        Assert.assertEquals(40, (int)stack.pop().getData());

        Assert.assertEquals(3, stack.getSize());
        stack.display();
    }

    @Test
    public void top() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        Assert.assertEquals(5, stack.getSize());
        stack.display();

        Assert.assertEquals(50, (int)stack.peek().getData());
        Assert.assertEquals(50, (int)stack.peek().getData());

        Assert.assertEquals(5, stack.getSize());
        stack.display();
    }

    @Test
    public void clear() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        Assert.assertEquals(5, stack.getSize());
        stack.display();

        stack.clear();

        Assert.assertEquals(0, stack.getSize());
        stack.display();
    }
}
