package io.lab.datastructure.queue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amazimpaka on 2018-03-10
 */
public class DefaultQueueTest {

    private final  Queue<Integer> queue = new DefaultQueue<>();

    @Test
    public void enqueue() {
        queue.enqueue(10);
        Assert.assertEquals(1, queue.getSize());

        queue.enqueue(20);
        Assert.assertEquals(2, queue.getSize());

        queue.enqueue(30);
        Assert.assertEquals(3, queue.getSize());

        queue.display();
    }

    @Test
    public void dequeue() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        Assert.assertEquals(5, queue.getSize());
        queue.display();

        Assert.assertEquals(10, (int) queue.dequeue().getData());
        Assert.assertEquals(20, (int) queue.dequeue().getData());
        Assert.assertEquals(30, (int) queue.dequeue().getData());
        Assert.assertEquals(40, (int) queue.dequeue().getData());
        Assert.assertEquals(50, (int) queue.dequeue().getData());

        Assert.assertEquals(0, queue.getSize());
        queue.display();
    }

    @Test
    public void top() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        Assert.assertEquals(5, queue.getSize());
        queue.display();

        Assert.assertEquals(50, (int) queue.peek().getData());
        Assert.assertEquals(50, (int) queue.peek().getData());

        Assert.assertEquals(5, queue.getSize());
        queue.display();
    }

    @Test
    public void clear() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        Assert.assertEquals(5, queue.getSize());
        queue.display();

        queue.clear();

        Assert.assertEquals(0, queue.getSize());
        queue.display();
    }
}
