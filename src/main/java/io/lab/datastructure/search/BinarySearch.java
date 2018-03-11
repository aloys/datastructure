package io.lab.datastructure.search;

import java.util.Arrays;

/**
 * Created by amazimpaka on 2018-03-11
 */
public class BinarySearch<T extends Comparable<T>> implements Search<T> {

    private final boolean sortBeforeSearch;

    public BinarySearch(boolean sortBeforeSearch) {
        this.sortBeforeSearch = sortBeforeSearch;
    }

    @Override
    public int find(T[] values, T key) {

        System.out.println(String.format("@@@@ Finding: %s in: %s"
                ,key,Arrays.toString(values)));

        if(values == null || values.length == 0){
            return -1;
        }

        if(sortBeforeSearch){
            Arrays.sort(values);
        }

        int low = 0;
        int high = values.length - 1;


        while(low <= high){
            int mid = low + (high - low)/2;

            Comparable<T> midValue = values[mid];
            int comparison = midValue.compareTo(key);

            System.out.println(String.format("Low: %s - Mid: %s - High: %s ==> [%s] - [%s]"
                    ,low,mid,high,midValue,comparison));

            if(comparison == 0){
                return mid;
            }

            if(comparison < 0){
                low = mid + 1 <= values.length - 1 ? mid + 1 : values.length - 1;
            }

            if(comparison > 0){
                high = mid - 1 >= 0 ? mid - 1 : 0;
            }

        }

        return -1;
    }
}
