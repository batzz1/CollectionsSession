package ListConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

    public static void main(String [] args) {
        /*
            Description HashMap
            *Hashmap is a class implements Map Interface
            * extends Abstractmap
            * it contains only unique elements
            * stores the value -key-value pair
            * it may have one null key and multiple null values
            * it maintains no order
            * it is non-synchronized -- not thread safe
         */
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        //put
        hashMap.put(1, "Selenium");
        hashMap.put(2, "Appium");
        hashMap.put(3, "Eclipse");
        hashMap.put(4, "Mobile");
        System.out.println(hashMap.get(1));

        //print
        System.out.println("** Printing Maps Values :");
        for (Map.Entry m : hashMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //remove
        hashMap.remove(3);
        System.out.println("*** Printing ***");
        ;
        System.out.println(hashMap);


        //Using With Employee Class
        HashMap<Integer, Employee> employeeHashMap = new HashMap<Integer, Employee>();

        Employee e1 = new Employee("Tom", 24, "Admin");
        Employee e2 = new Employee("Peter", 26, "QA");
        Employee e3 = new Employee("Steve", 27, "Dev");

        employeeHashMap.put(1 , e1);
        employeeHashMap.put(2 , e2);
        employeeHashMap.put(3 , e3);

        //Printing Key Value Employee or Iterate
        System.out.println("*** Printing ***");
        for(Map.Entry<Integer , Employee> m : employeeHashMap.entrySet()) {
            int key = m.getKey();
            Employee e = m.getValue();
            System.out.println("Employee " + key + " Info ");
            System.out.println(e.name + " " + e.age + " " + e.dept);
        }



    }


}
