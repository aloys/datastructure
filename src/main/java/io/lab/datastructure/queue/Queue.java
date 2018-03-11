package io.lab.datastructure.queue;

import io.lab.datastructure.model.Node;

/**
 * Created by amazimpaka on 2018-03-10
 */
public interface Queue<T> {

    Node<T> enqueue(T element);

    Node<T> dequeue();

    Node<T> peek();

    void clear();

    boolean isEmpty();

    int getSize();

    void display();
}
