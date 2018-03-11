package io.lab.datastructure.queue;

import io.lab.datastructure.model.Node;

/**
 * Created by amazimpaka on 2018-03-10
 */
public class DefaultQueue<T> implements Queue<T> {

    private Node<T> rear;
    private Node<T> front;
    private int size;

    @Override
    public Node<T> enqueue(T element) {

        final Node<T> node = new Node<>(element);
        node.setNext(this.rear);
        this.rear = node;
        node.setPosition(++size);

        if(this.front == null){
            this.front = node;
        }

        System.out.println("\t >>> Added : "+node);

        return node;
    }

    @Override
    public Node<T> dequeue() {

        if(size == 0 || this.rear == null){
            throw new IllegalStateException("Empty queue");
        }

        if(size == 1){
            Node<T> lastNode = this.front;
            this.front = null;
            this.rear = null;
            this.size = 0;

            System.out.println("\t >>> Removed : "+lastNode);
            return lastNode;
        }

        Node<T> previousNode = this.rear;
        while(previousNode.getNext().getNext() != null){
            previousNode = previousNode.getNext();
        }

        Node<T> lastNode = this.front;
        this.front = previousNode;
        this.front.setNext(null);
        this.size --;

        System.out.println("\t >>> Removed : "+lastNode);
        return lastNode;
    }

    @Override
    public Node<T> peek() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void display() {
        display(this.rear);
    }


    public void display(Node<T> node) {
        if(node != null){
            System.out.println(node);
            if (node.getNext() != null) {
                display(node.getNext());
            }
        }
    }
}
