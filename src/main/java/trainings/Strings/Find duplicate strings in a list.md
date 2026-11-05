Find duplicate strings in a list
Problem statement

Find duplicate strings in a list.

Input:
List<String> list = Arrays.asList(
    "Java", "Python", "Java", "Spring", "Python"
);


Expected output:
[Java, Python]


A. Approach and logic
The logic is identical to finding duplicate integers.

Use two sets:
- One to store already-seen strings.
- Another to store duplicates.
B. Plain Java
List<String> list = Arrays.asList(
        "Java", "Python", "Java", "Spring", "Python"
);

Set<String> seen = new HashSet<>();
Set<String> duplicates = new LinkedHashSet<>();

for (String str : list) {

    if (!seen.add(str)) {
        duplicates.add(str);
    }
}

System.out.println(duplicates);


C. Java 8
List<String> list = Arrays.asList(
        "Java", "Python", "Java", "Spring", "Python"
);

Set<String> seen = new HashSet<>();

Set<String> duplicates = list.stream()
        .filter(str -> !seen.add(str))
        .collect(Collectors.toCollection(LinkedHashSet::new));

System.out.println(duplicates);


D. Complexity
Solution	Time	Extra space
HashSet	O(n) average	O(n)
Java 8	O(n) average	O(n)

E. Choice of solution
Both are efficient.

One important detail: avoid using shared mutable state in parallel streams. This Stream solution is intended for sequential execution.


