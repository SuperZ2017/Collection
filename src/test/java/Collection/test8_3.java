package Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.Map;

public class test8_3 {

    private static Map<String, Integer> map;

    @Before
    public void init() {
        map = new HashMap<>(4);
        map.put("a", 12);
        map.put("b", 21);
        map.put("c", 3);
        map.put("d", 4);
    }

    /**
     * map forEach 方法
     */
    @Test
    public void forEach() {
        map.forEach((k, v) -> {
            System.out.println("k : " + k + "; v : " + v);
        });
    }

    /**
     * map Entry.comparingByKey 方法
     */
    @Test
    public void comparingByKey() {
        map
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .forEachOrdered(System.out::println);
    }

    /**
     * map Entry.comparingByValue 方法
     */
    @Test
    public void comparingByValue() {
        map
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        .forEachOrdered(System.out::println);
    }

    /**
     * map getOrDefault 方法，当 key 不存在时，返回一个默认值
     */
    @Test
    public void getOrDefault() {
        Integer value = map.getOrDefault("f", 20);
        System.out.println(value);
    }

    /**
     * map computeIfAbsent 方法，
     * 当 key 不存在的时候，使用该键重算新的值，并将其添加到 Map 中
     */
    @Test
    public void computeIfAbsent() {
        map.computeIfAbsent("g", i -> 12);
        System.out.println(map);
    }

    /**
     * map computeIfPresent 方法，
     * 当 key 存在的时候，计算该键的新值，并将其添加到 Map 中
     */
    @Test
    public void computeIfPresent() {
        map.computeIfPresent("c", (k, v) -> v + 12);
        System.out.println(map);
    }


    /**
     * map compute 方法
     * 使用指定的键计算新的值，并将其存储到 Map 中
     */
    @Test
    public void compute() {
        map.compute("c", (k, v) -> v + 10);
        System.out.println(map);
    }


    /**
     * map remove(k, v) 方法
     * 根据 k、v 来移除，必须 k，v 都对应才会移除
     */
    @Test
    public void remove() {
        map.remove("c", 4);
        System.out.println(map);
    }

    /**
     * map replaceAll() 方法
     * 通过 BiFunction 替换 map 中每个项的值
     */
    @Test
    public void replaceAll() {
        map.replaceAll((k, v) -> v * 10);
        System.out.println(map);
    }


    /**
     * map replace() 方法
     */
    @Test
    public void replace() {
        map.replace("c", 3, 5);
        System.out.println(map);
    }


    /**
     * map merge() 方法
     */
    @Test
    public void merge() {
        Map<String, Integer> map1 = Map.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> map2 = Map.of("a", 11, "d", 12, "f", 14);

        HashMap<String, Integer> map3 = new HashMap<>(map1);
        map2.forEach((k, v) ->
                map3.merge(k, v, (v1, v2) -> v1 + v2));

        System.out.println(map3);

    }


    @After
    public void destroy() {
        System.gc();
    }
}
