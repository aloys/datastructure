package io.lab.datastructure.search;

/**
 * Created by amazimpaka on 2018-03-11
 */
public interface Search<T extends Comparable<T>> {

    int find(T[] values, T key);
}
