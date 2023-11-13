package trainings;

public class EleAdd {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i] + arr[j] == n) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }

        }
        System.out.println(n);


    }
}
