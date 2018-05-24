package LR_8_HW.MyLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        long startTime1 = System.nanoTime();
    List<String> MyTestList = new LinkedList<>();
        for(int i = 0; i < 10; i++) {
            MyTestList.add("String" + MyTestList.size());
        }
        long duration = System.nanoTime() - startTime1;
        System.out.println("Наполнение коллекции произошло за: - " + duration/1000 + " msec\n");

        Iterator<String> inter = MyTestList.iterator();
        while (inter.hasNext()){
            System.out.println(inter.next() + "\n");
        }

        long startTime = System.nanoTime();
        for (int i =0; i <3; i++){
            MyTestList.remove(i);
        }
        duration = System.nanoTime() - startTime;
        System.out.println("Удаление элементов коллекции произошло за: - " + duration/1000 + " msec\n");

    Iterator<String> iter2 = MyTestList.iterator();
    while (iter2.hasNext()){
        System.out.println(iter2.next() + "\n");
    }

    }
}
