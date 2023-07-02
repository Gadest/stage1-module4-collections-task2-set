package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> combine = new HashSet<>();
        Set<String> result = new HashSet<>();
        combine.addAll(secondSet);
        combine.addAll(firstSet);
        for (String s:
                combine) {
            if(secondSet.contains(s)==true && firstSet.contains(s)==true){
                result.add(s);
            }
        }
        for (String s:
                thirdSet) {
            if (result.contains(s)==true ||secondSet.contains(s)==true || firstSet.contains(s)==true){
                result.remove(s);
            }
            else result.add(s);
        }
        return result;
    }
}
