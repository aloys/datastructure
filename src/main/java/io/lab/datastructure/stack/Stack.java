package io.lab.datastructure.stack;

import io.lab.datastructure.model.Node;

/**
 * Created by amazimpaka on 2018-03-10
 */
public interface Stack<T> {

    Node<T> push(T element);

    Node<T> pop();

    Node<T> peek();

    void clear();

    boolean isEmpty();

    int getSize();

    void display();
}
