package io.lab.datastructure.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

/**
 * Created by amazimpaka on 2018-03-09
 */
public class SimpleLinkedListTest {

    private LinkedList<Integer>  linkedList = new SimpleLinkedList<Integer>();


    @Test
    public void insert(){
        //insert at first and second positions
        linkedList.insert(10);
        Assert.assertEquals(1, linkedList.size());

        linkedList.insert(20);
        Assert.assertEquals(2, linkedList.size());

        linkedList.insert(30);
        Assert.assertEquals(3, linkedList.size());

        linkedList.insert(11);
        Assert.assertEquals(4, linkedList.size());
        linkedList.display();
       /* linkedList.insert(30,2);
        linkedList.display();


        //Override and push node at second position
        linkedList.insert(20,2);

        Assert.assertEquals(3, linkedList.size());*/

        //linkedList.insert(40,4);
        //linkedList.insert(50,5);

    }

    @Test
    public void search(){
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);
        linkedList.display();

        Assert.assertEquals(Integer.valueOf(10), linkedList.search(1).getData());
        Assert.assertEquals(Integer.valueOf(40), linkedList.search(4).getData());
        Assert.assertEquals(Integer.valueOf(50), linkedList.search(5).getData());
        Assert.assertEquals(null,linkedList.search(25));
    }
}
