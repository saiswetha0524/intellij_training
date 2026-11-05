Find the frequency of each element
-----------------------------------

A HashMap is ideal because it stores key-value pairs.
- Key = Array element.
- Value = Frequency of that element.

plain java
--------
import java.util.*;

public class ElementFrequency {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4};

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println(
                    entry.getKey() + " = " + entry.getValue()
            );
        }
    }
}


java 8
------
import java.util.*;
import java.util.stream.*;

public class ElementFrequency {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4};

        Map<Integer, Long> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        num -> num,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println(map);
    }
}


{1=1, 2=2, 3=3, 4=1}

E. Complexity
Solution	Time	Extra space
Plain Java HashMap	O(n) average	O(k)
Java 8 groupingBy	O(n) average	O(k)

Here, k represents the number of distinct elements.

Interview follow-up: Why use LinkedHashMap instead of HashMap?

Answer: LinkedHashMap preserves insertion order, whereas HashMap does not guarantee iteration order.
