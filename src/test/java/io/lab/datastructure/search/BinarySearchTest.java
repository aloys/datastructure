package io.lab.datastructure.search;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amazimpaka on 2018-03-11
 */
public class BinarySearchTest {

    private final Search<Integer> binarySearch = new BinarySearch<>(true);

    @Test
    public void search(){
        Integer[] values = {10, 14, 19, 26,27,31, 33, 35, 42, 44};
        Assert.assertEquals(0, binarySearch.find(values,10));
        Assert.assertEquals(5, binarySearch.find(values,31));
        Assert.assertEquals(9, binarySearch.find(values,44));
    }
}
