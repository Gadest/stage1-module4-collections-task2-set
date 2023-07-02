package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> treeSet = new TreeSet<>();
        for (Integer i:
                sourceList) {
            treeSet.add((int) Math.pow(i,2));
        }
        Set<Integer> result = treeSet.subSet(lowerBound,upperBound+1);
        return result;
    }
}
