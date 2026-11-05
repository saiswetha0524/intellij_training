Find the first non-repeated character
Problem statement

Find the first character that occurs only once in a string.

Input:
String str = "swiss";


Expected output:
w


A. Approach and logic
We need to count the occurrences of each character while preserving the original order.

Use LinkedHashMap.

Why?
- HashMap stores key-value pairs but doesn't guarantee insertion order.
- LinkedHashMap maintains insertion order.
Steps:
1. Traverse the string.
2. Count every character.
3. Traverse the map.
4. Return the first character whose frequency is 1.
B. Plain Java
String str = "swiss";

Map<Character, Integer> map = new LinkedHashMap<>();

for (char ch : str.toCharArray()) {

    map.put(ch, map.getOrDefault(ch, 0) + 1);
}

for (Map.Entry<Character, Integer> entry : map.entrySet()) {

    if (entry.getValue() == 1) {

        System.out.println(entry.getKey());
        break;
    }
}


C. Dry run
Character	Frequency
s	3
w	1
i	1

Original order: s, w, i.

The first character with frequency 1 is w.
D. Java 8
String str = "swiss";

Character result = str.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(
                c -> c,
                LinkedHashMap::new,
                Collectors.counting()
        ))
        .entrySet()
        .stream()
        .filter(entry -> entry.getValue() == 1)
        .map(Map.Entry::getKey)
        .findFirst()
        .orElse(null);

System.out.println(result);


E. Complexity
Solution	Time	Extra space
LinkedHashMap	O(n)	O(k)
Java 8	O(n)	O(k)

Here k is the number of distinct characters.
F. Choice of solution
Use LinkedHashMap because it clearly demonstrates frequency counting and insertion-order preservation.

Interview follow-up: What if the interviewer asks for the first repeated character instead?

Change the condition to check whether the character has already appeared while traversing the string, or find the first character with frequency greater than one while preserving insertion order.






