package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set= new HashSet<>();
        int temp;
        for (Integer i:
                sourceList) {
            temp = i;
            if (temp % 2 == 0) {
                while (temp%2==0) {
                    set.add(temp);
                    temp = temp / 2;
                }
                set.add(temp);
            } else{
                set.add(temp);
                set.add(temp*2);
            }
        }
        return set;
    }
}
