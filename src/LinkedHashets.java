package src;

import java.util.LinkedHashSet;

public class LinkedHashets {

    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(5);
        linkedHashSet.add(7);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(3);

        System.out.println(linkedHashSet.size());

        for (Integer x : linkedHashSet){
            System.out.println(x);
        }




    }

}
