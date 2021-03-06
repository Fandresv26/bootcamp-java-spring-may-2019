package collectionsChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedListInsertMiddle {

    public static void main(String[] args){

        List<Integer> list = new LinkedList<>();

        //Se agrega el mismo conjunto de datos.
        list.add(4);
        list.add(67);
        list.add(3);
        list.add(0);
        list.add(4);

        list.add(8);
        list.add(27);
        list.add(37);
        list.add(85);
        list.add(34);

        list.add(467);
        list.add(63);
        list.add(27);
        list.add(234);
        list.add(47);

        list.add(52);
        list.add(73);
        list.add(69);
        list.add(5);
        list.add(38);

        long start = System.nanoTime();

        list.add(list.size()/2, 35);

        long end = System.nanoTime();

        System.out.println("Time: " + ((end - start)/10));
    }
}
