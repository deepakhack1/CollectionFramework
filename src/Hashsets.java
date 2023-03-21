package src;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;


class Employee{

    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.id + " " + this.name;
    }

//    @Override
//    public int hashCode() {
//        return this.id;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        Employee employee = (Employee) obj;
//        if (employee.id == this.id) {
//            employee.setName(this.name);
//            return true;
//        } else {
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
public class Hashsets {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(12);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(9);


        System.out.println(hashSet.size());

        for(Integer x : hashSet){
            System.out.println(x);
        }

        System.out.println(hashSet);

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashSet<Employee> hashSet1 = new HashSet<>();
        Employee employee1 = new Employee(101,"Sai");
        Employee employee2 = new Employee(102,"Deepak");
        Employee employee3 = new Employee(101,"dfg");
        Employee employee4 = new Employee(102,"Deepak1");


        hashSet1.add(employee1);
        hashSet1.add(employee2);
        hashSet1.add(employee3);
        hashSet1.add(employee4);

        System.out.println(hashSet1);







    }



}
