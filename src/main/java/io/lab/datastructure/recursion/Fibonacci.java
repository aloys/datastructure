package io.lab.datastructure.recursion;

/**
 * Created by amazimpaka on 2018-03-10
 */
public class Fibonacci {

    public static int compute(int n){

        if(n < 0){
            throw new IllegalArgumentException(String.format("Input value: %d is not positive",n));
        }

        // -------- base cases ------------
        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        // -------- recursive case ------------
        return compute(n-2) + compute(n-1);
    }
}
