package LR_8_HW.MyLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {

        long startTime1 = System.nanoTime();
    List<Integer> testList = new ArrayList();
        for (int i = 0; i < 10 ; i ++){
            testList.add(i + 12);
        }
        long duration = System.nanoTime() - startTime1;
        System.out.println("Наполнение коллекции произошло за: - " + duration/1000 + " msec\n");
        Collections.sort(testList);

        for (int i = 0; i < testList.size(); i++){
            System.out.println(testList.get(i));
        }
        long startTime = System.nanoTime();
        for (int i =0; i <3; i++){
            testList.remove(i);
        }
        duration = System.nanoTime() - startTime;
        System.out.println("Удаление элементов коллекции произошло за: - " + duration/1000 + " msec\n");
        duration = System.nanoTime() - startTime1;
        System.out.println("Время выполнения программы: " + duration/1000 + " msec" );

    }
}
