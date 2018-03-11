package io.lab.datastructure.recursion;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by amazimpaka on 2018-03-10
 */
public class FactorialTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void compute_negativeValue(){
        expectedException.expect(IllegalArgumentException.class);

        Factorial.compute(-10);
    }

    @Test
    public void compute_zeroValue(){
        Assert.assertEquals(1, Factorial.compute(0));
    }

    @Test
    public void compute_positiveValue(){

        Assert.assertEquals(1, Factorial.compute(1));
        Assert.assertEquals(2, Factorial.compute(2));
        Assert.assertEquals(6, Factorial.compute(3));
        Assert.assertEquals(24, Factorial.compute(4));
        Assert.assertEquals(120, Factorial.compute(5));
        Assert.assertEquals(720, Factorial.compute(6));
        Assert.assertEquals(5040, Factorial.compute(7));

    }

}


