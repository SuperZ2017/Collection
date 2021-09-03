package Collection;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test8_2 {

    private static List<Integer> list;

    @Before
    public void init() {
        list = new ArrayList<>(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
    }

    /**
     * removeIf 方法可以用于 List、Set
     */
    @Test
    public void removeIf() {
        list.removeIf(i -> i >= 5); // [1, 2, 3, 4]
        System.out.println(list);
    }


    /**
     * replaceAll 方法，用于 List、Set
     */
    @Test
    public void replaceAll() {
        list.replaceAll(i -> i * 2);    // [2, 4, 6, 8, 10, 12]
        System.out.println(list);
    }


}
