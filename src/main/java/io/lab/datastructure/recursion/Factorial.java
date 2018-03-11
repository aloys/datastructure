package io.lab.datastructure.recursion;

/**
 * Created by amazimpaka on 2018-03-10
 */
public class Factorial {

    public static int compute(int n){

        if(n < 0){
            throw new IllegalArgumentException(String.format("Input value: %d is not positive",n));
        }

        // -------- base case ------------
        if(n == 0){
            return 1;
        }

        // -------- recursive case ------------
        return n * compute(n-1);
    }
}
