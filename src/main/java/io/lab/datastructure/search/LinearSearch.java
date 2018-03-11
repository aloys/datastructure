package io.lab.datastructure.search;

/**
 * Created by amazimpaka on 2018-03-11
 */
public class LinearSearch<T extends Comparable<T>> implements Search<T> {

    @Override
    public int find(T[] values, T key) {
        for(int index = 0; index < values.length; index++){
            if(values[index].equals(key)){
                return index;
            }
        }
        return -1;
    }
}
