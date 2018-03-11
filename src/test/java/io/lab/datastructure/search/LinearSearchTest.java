package io.lab.datastructure.search;

import io.lab.datastructure.recursion.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amazimpaka on 2018-03-11
 */
public class LinearSearchTest {

    private final Search<Integer> linearSearch = new LinearSearch<>();

    @Test
    public void search(){
        Integer[] values = {10, 20, 30, 40, 50};
        Assert.assertEquals(0,linearSearch.find(values,10));
        Assert.assertEquals(1,linearSearch.find(values,20));
        Assert.assertEquals(2,linearSearch.find(values,30));
        Assert.assertEquals(3,linearSearch.find(values,40));
        Assert.assertEquals(4,linearSearch.find(values,50));

        Assert.assertEquals(-1,linearSearch.find(values,90));
        Assert.assertEquals(-1,linearSearch.find(values,-70));
    }
}
