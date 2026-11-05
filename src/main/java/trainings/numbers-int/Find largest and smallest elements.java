Find largest and smallest elements
Problem statement

Find the minimum and maximum elements in an array.

Input:
int[] arr = {10, 5, 40, 2, 90, 15};


Expected output:
Largest = 90
Smallest = 2


A. Approach and logic
Initialize both minimum and maximum with the first array element.

Traverse the array and update them whenever you find a smaller or larger value.
B. Plain Java
int[] arr = {10, 5, 40, 2, 90, 15};

int max = arr[0];
int min = arr[0];

for (int num : arr) {

    if (num > max) {
        max = num;
    }

    if (num < min) {
        min = num;
    }
}

System.out.println("Largest = " + max);
System.out.println("Smallest = " + min);


C. Java 8
int[] arr = {10, 5, 40, 2, 90, 15};

OptionalInt max = Arrays.stream(arr).max();

OptionalInt min = Arrays.stream(arr).min();

System.out.println("Largest = " + max.getAsInt());
System.out.println("Smallest = " + min.getAsInt());


OptionalInt is used because an array may be empty.
D. Complexity
Solution	Time	Extra space
Plain Java	O(n)	O(1)
Java 8	O(n)	O(1) auxiliary space

E. Choice of solution
Both are efficient.

For Java 8 interviews, remember max(), min() and OptionalInt.
