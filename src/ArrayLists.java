package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;


public class ArrayLists {


    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(); //creates arraylist
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println("Size of arrayList :"+arrayList.size());

        final Integer remove =arrayList.remove(2);


        System.out.println("Size of arrayList :"+arrayList.size());

        arrayList.add(0,5);

        System.out.println(arrayList.size());



       Integer ele =  arrayList.get(2);
       System.out.println(ele);


        System.out.println(arrayList);
        final Integer remove1 = arrayList.remove(1);

        System.out.println(arrayList);

        final boolean remove2 = arrayList.remove(Integer.valueOf(7));
        System.out.println(remove2);  //True

        System.out.println(arrayList);

        //Iteration
        System.out.println("Iteration");
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        //Advanced Loop(for each loop)
        for(Integer x : arrayList){
            System.out.println(x);
        }

        //Iterator
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
          //  iterator.remove();
        }

      //  System.out.println(arrayList);

        //ListIterator is only used for List Interface
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
         //   listIterator.next();
            System.out.println(listIterator.next());
        }

        //Java8 method(for each method)
        System.out.println("for each method");
        arrayList.forEach(value -> System.out.println(value));


        //Task
   //     1. Install IntelliJ Comunity edition
  //      2. Make a profile on github
  // 3. Understand multithread and synchroniation


        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(7);
        System.out.println(arrayList);

















    }

}
