package LR_8_HW.MyLists;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class myTreeSet {
    public static void main(String[] args) {
        Set<Integer> myTree = new TreeSet();
        long startTime1 = System.nanoTime();
        for (int i = 0; i< 10; i++) {
            myTree.add(i+1);

        }
        long duration = System.nanoTime() - startTime1;
        System.out.println("Наполнение коллекции произошло за: - " + duration/1000 + " msec\n");
        System.out.println(myTree);
        long startTime = System.nanoTime();

        myTree.clear();
        duration = System.nanoTime() - startTime;
        System.out.println("Удаление коллекции произошло за: - " + duration/1000 + " msec\n");
        duration = System.nanoTime() - startTime1;
        System.out.println("Время выполнения программы: " + duration/1000 + " msec" );


    }
}
