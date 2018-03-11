package io.lab.datastructure.model;

/**
 * Created by amazimpaka on 2018-03-09
 */
public final class Node<T> {

    private final T data;
    private int position;
    private Node<T> next;


    public Node(T data) {
        this.data = data;
    }

    public Node(T data, int position) {
        this.data = data;
        this.position = position;
    }

    public T getData() {
        return data;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append(" data=").append(data);
        sb.append(", position=").append(position);
        sb.append(", next=").append(next != null ? next.position : -1);
        sb.append('}');
        return sb.toString();
    }
}
