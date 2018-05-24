package LR_8_HW.MyLists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class hasSet {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Set<String> hasSetList = new HashSet();
            for(int i = 0; i< 10; i++){
                hasSetList.add("Student-" + hasSetList.size());
            }
        long duration = System.nanoTime() - startTime;
        System.out.println("Наполнение коллекции произошло за: - " + duration/1000 + " msec\n");

        Iterator<String> iter = hasSetList.iterator();
            while(iter.hasNext()){
                System.out.println(iter.next());
            }
        startTime = System.nanoTime();
            for(int i =0; i < 4; i++) {
                hasSetList.remove(i);
            }
        duration = System.nanoTime() - startTime;
        System.out.println("Удаление 3-х элементов произошло за: - " + duration/1000 + " msec\n\n");
    }
}
