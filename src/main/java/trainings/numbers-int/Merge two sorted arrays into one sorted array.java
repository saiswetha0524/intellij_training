Merge two sorted arrays into one sorted array
Problem statement

Given two already sorted arrays, merge them into a single sorted array.

Input:
int[] a = {1, 3, 5};
int[] b = {2, 4, 6};


Expected output:
[1, 2, 3, 4, 5, 6]


A. Approach and logic
Since both arrays are already sorted, we don't need to sort the final result again.

Use two pointers:
- i tracks the first array.
- j tracks the second array.
- k tracks the result array.
Compare a[i] and b[j].

Place the smaller element into the result and advance its pointer.

Continue until one array is exhausted. Copy the remaining elements from the other array.
B. Plain Java
int[] a = {1, 3, 5};
int[] b = {2, 4, 6};

int[] result = new int[a.length + b.length];

int i = 0, j = 0, k = 0;

while (i < a.length && j < b.length) {

    if (a[i] <= b[j]) {
        result[k++] = a[i++];
    } else {
        result[k++] = b[j++];
    }
}

while (i < a.length) {
    result[k++] = a[i++];
}

while (j < b.length) {
    result[k++] = b[j++];
}

System.out.println(Arrays.toString(result));


C. Dry run
Comparison	Selected value	Result
1 vs 2	1	1
3 vs 2	2	1, 2
3 vs 4	3	1, 2, 3
5 vs 4	4	1, 2, 3, 4
5 vs 6	5	1, 2, 3, 4, 5
Remaining	6	1, 2, 3, 4, 5, 6

D. Java 8
int[] a = {1, 3, 5};
int[] b = {2, 4, 6};

int[] result = IntStream.concat(
        Arrays.stream(a),
        Arrays.stream(b)
).sorted()
 .toArray();

System.out.println(Arrays.toString(result));


E. Complexity
Let total elements be N = n + m.
Solution	Time	Extra space
Two pointers	O(n + m)	O(n + m)
Java 8 concat + sorted	O(N log N)	O(N)

F. Choice of solution
Choose the two-pointer approach.

This is an important interview distinction: when input arrays are already sorted, take advantage of their ordering instead of sorting everything again.
