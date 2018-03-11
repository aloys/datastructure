package io.lab.datastructure.stack;

import io.lab.datastructure.model.Node;

/**
 * Created by amazimpaka on 2018-03-10
 */
public class DefaultStack<T> implements Stack<T> {

    private Node<T> top;
    private int size;

    @Override
    public Node<T> push(T element) {
        final Node<T> node = new Node<>(element);
        node.setNext(this.top);
        this.top = node;
        node.setPosition(++size);

        System.out.println("\t >>> Added : "+node);

        return node;
    }

    @Override
    public Node<T> pop() {

        if(size == 0 || top == null){
            throw new IllegalStateException("Empty stack");
        }

        final Node<T> node = this.top;
        this.top = top.getNext();
        this.size--;
        return node;
    }

    @Override
    public Node<T> peek() {

        if(size == 0 || top == null){
            throw new IllegalStateException("Empty stack");
        }
        return this.top;
    }

    @Override
    public void clear() {
        remove(this.top);
    }

    public void remove(Node<T> node) {

        if(node == null){
            return;
        }
        remove(node.getNext());

        System.out.println("\t >>> Removing : "+node);
        this.size--;
        node.setNext(null);
        node = null;
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
        display(this.top);
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
