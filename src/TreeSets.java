package src;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSets {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(9);
        treeSet.add(2);
        treeSet.add(6);

        System.out.println(treeSet.size());

        for(Integer x : treeSet){
            System.out.println(x);
        }

        final Integer ceiling = treeSet.ceiling(5);
        System.out.println(ceiling);

        System.out.println(treeSet);

        final Integer floor = treeSet.floor(10);
        System.out.println(floor);

        final NavigableSet<Integer> integers = treeSet.descendingSet();
        System.out.println(integers);

    }

}
