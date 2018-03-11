package io.lab.datastructure.recursion;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by amazimpaka on 2018-03-10
 */
public class FibonacciTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void compute_negativeValue(){
        expectedException.expect(IllegalArgumentException.class);

        Fibonacci.compute(-10);
    }

    @Test
    public void compute_initialValues(){
        Assert.assertEquals(0, Fibonacci.compute(0));
        Assert.assertEquals(1, Fibonacci.compute(1));
    }

    @Test
    public void compute_positiveValue(){

        Assert.assertEquals(1, Fibonacci.compute(2));
        Assert.assertEquals(2, Fibonacci.compute(3));
        Assert.assertEquals(3, Fibonacci.compute(4));
        Assert.assertEquals(5, Fibonacci.compute(5));
        Assert.assertEquals(8, Fibonacci.compute(6));
        Assert.assertEquals(13, Fibonacci.compute(7));
        Assert.assertEquals(21, Fibonacci.compute(8));
        Assert.assertEquals(34, Fibonacci.compute(9));
        Assert.assertEquals(55, Fibonacci.compute(10));


    }

}


