package LR_7_HW.Sorting;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Random;
public class ArrayListExample {
    /* Provides an example of how to work with the ArrayList container */

    public void doArrayListExample() {

        final int MAX = 10;
        int counter = 0;

        System.out.println("----------------------------------------------");
        System.out.println("Create/Store objects in an ArrayList container");
        System.out.println("----------------------------------------------");
        System.out.println();

        List listA = new ArrayList();
        List listB = new ArrayList();

        for (int i = 0; i < MAX; i++) {
            System.out.println("  - Storing Integer(" + i + ")");
            listA.add( new Integer(i) );
        }

        System.out.println("  - Storing String(Alex)");
        listA.add("Alex");

        System.out.println("  - Storing String(Melody)");
        listA.add("Melody");

        System.out.println("  - Storing String(Jeff)");
        listA.add("Jeff");

        System.out.println("  - Storing String(Alex)");
        listA.add("Alex");

        System.out.println("---------------- ");
        System.out.println("Retrieve Objects ");
        System.out.println("---------------- ");
        System.out.println();

        Iterator i = listA.iterator();
        while ( i.hasNext() ) {
            System.out.println( i.next() );
        }

        System.out.println("-------------------------------------");
        System.out.println("Retrieve objects using a ListIterator");
        System.out.println("-------------------------------------");
        System.out.println();

        counter = 0;
        ListIterator li = listA.listIterator();
        while ( li.hasNext() == true ) {
            System.out.println("Element [" + counter + "] = " + li.next());
            System.out.println("  - hasPrevious    = " + li.hasPrevious());
            System.out.println("  - hasNext        = " + li.hasNext());
            System.out.println("  - previousIndex  = " + li.previousIndex());
            System.out.println("  - nextIndex      = " + li.nextIndex());
            System.out.println();
            counter++;
        }

        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Retrieve objects via an index");
        System.out.println("-----------------------------");
        System.out.println();

        for (int j=0; j < listA.size(); j++) {
            System.out.println("[" + j + "] - " + listA.get(j));
        }

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Search for an object and retrieve an index");
        System.out.println("------------------------------------------");
        System.out.println();

        int locationIndex = listA.indexOf("Jeff");
        System.out.println("Index location of the String \"Jeff\" is: " + locationIndex);
    }

    public static void main(String[] args) {

        ArrayListExample listExample = new ArrayListExample();
        listExample.doArrayListExample();

    }
}
