package Collection;


import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class test8_1 {


    /**
     *  List 工厂方法，创建 只读列表，不可以存放 null
     */
    @Test
    public void ListOf() {
        List<String> al = List.of("a", "b", "c");
        System.out.println(al);
    }

    /**
     * Set 工厂方法，创建 只读列表，不可以存放 null、重复元素
     */
    @Test
    public void SetOf() {
        Set<String> bl = Set.of("a", "b", "c");
        System.out.println(bl);
    }

    /**
     * Map 工厂方法1， 创建 不可变的 map，交替键值，
     * 适合键值对不到10个的 map
     */
    @Test
    public void MapOf1() {
        Map<String, Integer> c1 = Map.of("a", 1, "b", 2, "c", 3);
        System.out.println(c1); // {a=1, b=2, c=3}
    }

    /**
     * Map 工厂方法2
     */
    @Test
    public void MapOf2() {
        Map<String, Integer> kvMap = Map.ofEntries(Map.entry("a", 1),
                                                    Map.entry("b", 2),
                                                    Map.entry("c", 3));

        System.out.println(kvMap);
    }

}
