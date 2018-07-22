package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

    public static void main(String [] args){
        /*
            Create a Raw ArrayList  --> <arraylist> which holds data
         */
        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("Size of ArrayList " +arrayList.size());
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(12.4);
        arrayList.add('c');
        arrayList.add(true);
        arrayList.add("test");
        System.out.println(arrayList.size()); //size of ArrayList

        System.out.println("Getting element from index " +arrayList.get(4)); //to et the value from an index

        //To print all the values from arraylist
        //1. For loop
        //2. Iterator

        for (int i = 0 ; i < arrayList.size() ; i++ ) {
            System.out.println(arrayList.get(i));
        }

        //Non Generic vs Generic
        //Create a Generic ArrayList <ar>
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(100);
        ar.add(12);

        //Employee Class Object
        Employee employee = new Employee("Gaurav" , 26, "QA");
        Employee employee1 = new Employee("GRV" , 27, "Dev");
        Employee employee2 = new Employee("Test" , 28, "Admin");

        //Create ArrayList
        // arraylist1  holds type <Employee>
        ArrayList<Employee> arrayList1 = new ArrayList<Employee>();
        arrayList1.add(employee);
        arrayList1.add(employee1);
        arrayList1.add(employee2);

        //Iterator to traverse the values
        Iterator<Employee> iterator = arrayList1.iterator();
        while(iterator.hasNext()) {
            Employee emp = iterator.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }
    }
}
