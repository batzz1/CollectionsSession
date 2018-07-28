package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTabeConcept {

    public static void main(String[] args) {
        /*
            Hashtable is similar to Hashmap but it is synchroized
            It stores the values on the basis of key-value
            key --> Object --HashCode --> value
         */

        Hashtable hashtable = new Hashtable();
       hashtable.put(1, "Tom");
       hashtable.put(2, "Test");
       hashtable.put(3, "Java");

       //Create a clone or shallow copy

        Hashtable hashtable1 = new Hashtable();
        hashtable1 = (Hashtable) hashtable.clone();

        System.out.println("Values from Hashtable1 " +hashtable);
        System.out.println("Values from hashtable2 " +hashtable1);

        hashtable.clear();
        System.out.println("Values from Hashtable1 " +hashtable);
        System.out.println("Values from hashtable2 " +hashtable1);

        //contains value:

        Hashtable st = new Hashtable();
        st.put("A", "Batman");
        st.put("B", "SuperHero");
        st.put("C", "Leader");

        if(st.containsValue("Batman")) {
            System.out.println("Value is Found");
        }

        //print all values/Iterate values - Enumeration  -- elements()
        Enumeration e = st.elements();
        System.out.println("Print values from st using enumeration ***" );
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        //get all the values from hashtable using  -- entrySet() --set of hashtable values

        Set s = st.entrySet();
        System.out.println("Print values from st using entryset " +s);


        Hashtable st1 = new Hashtable();
        st1.put("A", "Batman");
        st1.put("B", "SuperHero");
        st1.put("C", "Leader");

        //check if hashtable objects are equal

        if(st.equals(st1)){
            System.out.println("Both st and st1 are equal");
        }

        //get the value from key:
        System.out.println(st1.get("A"));

        //get the hashcode of hashtable object
        System.out.println("Hashcode Value of st1 " + st1.hashCode());
    }
}
