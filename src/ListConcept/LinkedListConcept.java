package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        //Add
        ll.add("Test");
        ll.add("Appium");
        ll.add("Selenium");
        ll.add("API");
        ll.add("UFT");
        ll.add("Android");
        ll.add("iOS");


        //print
        System.out.println("Content of Linked list : " +ll);

        //addfirst
        ll.addFirst("First");
        //addlast
        ll.addLast("Last");
        System.out.println("Content of Linked list : " +ll);

        //get:
        System.out.println(ll.get(0 ));
        //set
        ll.set(0,"Windows");

        System.out.println("Content of Linked list : " +ll);

        //remove first and last
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Content of Linked list : " +ll);

        //remove from specific position
        ll.remove(2);
        System.out.println("Content of Linked list : " +ll);

        //how to iterate
        //for loop
        System.out.println("*** Using for Loop ");
        for(int i= 0 ; i < ll.size() ; i++) {
            System.out.println(ll.get(i));
        }

        //advance for loop
        System.out.println("**** Using Advance For Loop");
        for (String all : ll) {
            System.out.println(all);
        }
        //iterator
        System.out.println("***** Using Iterator");
        Iterator<String> it = ll.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //while loop
        System.out.println("***** Using while Loop");
        int num = 0;
        while (ll.size() > num){
            System.out.println(ll.get(num));
            num++;
        }

    }


}

