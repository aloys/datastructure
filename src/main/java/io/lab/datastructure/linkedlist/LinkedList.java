package io.lab.datastructure.linkedlist;

import io.lab.datastructure.model.Node;

/**
 * Created by amazimpaka on 2018-03-09
 */
public interface LinkedList<T> {

    /**
     * Add an element at the end of the list.
     *
     * @param item: data of element to be added
     * @return newly inserted node found
     */
    Node<T> insert(T item);

    /**
     * Find an element with a given key.
     *
     * @param position: position of element to be found
     * @return Optional node found by key
     */
    Node<T> search(int position);

    /**
     * Delete first node
     *
     * @return deleted node
     */
    Node<T> delete();

    /**
     * Delete node found by key
     *
     * @param position: position of the node to be deleted
     * @return deleted node
     */
    Node<T> delete(int position);

    /**
     * Display on console the content of all elements in linked list,
     * starting from the head element.
     *
     */
    void display();

    /**
     * Get the total number of elements in linked list
     *
     * @return number of elements in linked list
     */
    int size();

}
