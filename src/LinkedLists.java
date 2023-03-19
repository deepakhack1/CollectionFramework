package src;

import java.util.*;

public class LinkedLists {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList);

        Iterator iterator = linkedList.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());

        }


        linkedList.add(2,6);
        System.out.println(linkedList);

        System.out.println(linkedList.get(4)); //
    //[2,3,6,4,5]

        linkedList.addFirst(2); //[2,2,3,6,4,5]

        linkedList.addLast(6); //[2,2,3,6,4,5,6]

        System.out.println(linkedList);

        System.out.println(linkedList.getFirst()); //2

        System.out.println(linkedList.getLast());   //6

        System.out.println(linkedList.peek());  //Top element

        System.out.println(linkedList.pop());  //removes and print

        System.out.println(linkedList.poll());

        System.out.println(linkedList);

        linkedList.remove(Integer.valueOf(3));  //removes 3

        linkedList.remove(3);  // remove 3rd index :- 6

        System.out.println(linkedList);

        System.out.println(linkedList.removeFirst());

        System.out.println(linkedList.removeLast());

        System.out.println(linkedList);

        linkedList.add(2);

        linkedList.addFirst(2);

        System.out.println(linkedList);

        linkedList.removeFirstOccurrence(Integer.valueOf(2));

        System.out.println(linkedList);

        final Spliterator<Integer> spliterator = linkedList.spliterator();

        final long l = spliterator.estimateSize();

        System.out.println(l);



    }

}
