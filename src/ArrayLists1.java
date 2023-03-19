package src;

import java.util.ArrayList;

public class ArrayLists1 {

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Deepak");
        arrayList.add("Sai");
        arrayList.add("Surya");
        arrayList.add("Deepak");

        System.out.println(arrayList.size());

//        arrayList.remove("Deepak");  //True
//
//        arrayList.remove(1);  //  removes surya

        System.out.println(arrayList);

        System.out.println(arrayList.indexOf("Deepak"));

        System.out.println(arrayList.lastIndexOf("Deepak"));

        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("abc");
        arrayList1.add("xyz");
        arrayList1.add("Deepak");

        arrayList.addAll(arrayList1);

        System.out.println(arrayList);
        System.out.println(arrayList1);

//        arrayList.removeAll(arrayList1);

        System.out.println(arrayList);

        System.out.println(arrayList);

        final boolean deepak = arrayList.get(0).equals(arrayList1.get(2));
        System.out.println(deepak);



        final boolean deepak1 = arrayList.contains("Deepak");
        System.out.println(deepak1);

        //arrayList.removeAll(arrayList);
        System.out.println(arrayList);

        if(arrayList.isEmpty()){
            System.out.println("Empty");
        }

        final Object[] objects = arrayList.toArray();

        for(Object arr : objects){
            System.out.println(arr);
        }

    }

}
