package io.lab.datastructure.linkedlist;

import io.lab.datastructure.model.Node;

/**
 * Created by amazimpaka on 2018-03-09
 */
public class SimpleLinkedList<T> implements LinkedList<T> {

    private Node<T> head;
    private int size;


    @Override
    public synchronized Node<T> insert(T item) {

        if(this.head == null){
            final Node<T> node = new Node<>(item,1);
            this.head = node;
            this.size = 1;
            return node;
        }

        Node<T> next = head;
        while(next != null && next.getNext() != null){
            next = next.getNext();
        }

        this.size ++;
        final Node<T> node = new Node<>(item,size);
        next.setNext(node);
        return node;
    }

    public Node<T> search(int position) {
        return search(position,this.head);
    }

    private Node<T> search(int position,Node<T> node) {

        if(node!= null && node.getPosition() == position){
            return node;
        }

        if (node!= null && node.getNext() != null) {
            return  search(position, node.getNext());
        }

        return null;
    }

    public synchronized Node<T> delete() {
        return null;
    }

    public synchronized Node<T> delete(int position) {
        return null;
    }

    public void display() {
        display(this.head);
    }

    public int size() {
        return this.size;
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
