Convert a list into a map
Problem statement

Convert a list of strings into a map where:
- Key = String.
- Value = Length of the string.
Input:
List<String> list = Arrays.asList(
    "Java", "Spring", "Kafka"
);


Expected output:
{Java=4, Spring=6, Kafka=5}


A. Approach and logic
We need to iterate through the list and create a key-value pair for every element.

For plain Java, use a HashMap.

For Java 8, use Collectors.toMap().
B. Plain Java
List<String> list = Arrays.asList(
        "Java", "Spring", "Kafka"
);

Map<String, Integer> map = new HashMap<>();

for (String str : list) {

    map.put(str, str.length());
}

System.out.println(map);


C. Java 8
List<String> list = Arrays.asList(
        "Java", "Spring", "Kafka"
);

Map<String, Integer> map = list.stream()
        .collect(Collectors.toMap(
                str -> str,
                str -> str.length()
        ));

System.out.println(map);


D. Complexity
Let n be the number of strings.
Solution	Time	Extra space
HashMap	O(n) average	O(n)
Java 8	O(n) average	O(n)

E. Choice of solution
Use Collectors.toMap() when converting a list into a map.

Important interview follow-up: What if the list contains duplicate strings?

For example:
Arrays.asList("Java", "Spring", "Java");


The two-argument toMap() will throw IllegalStateException because duplicate keys are not allowed.

Provide a merge function:
Map<String, Integer> map = list.stream()
        .collect(Collectors.toMap(
                str -> str,
                str -> str.length(),
                (oldValue, newValue) -> oldValue
        ));


This keeps the existing value when a duplicate key is encountered.





