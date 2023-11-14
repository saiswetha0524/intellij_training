package trainings;

import java.util.HashMap;

public class EleAdd {
    public static void main(String[] args) {

        // way one
        /*int[] arr = {1, 2, 3, 4, 5};
        int n = 5;

        for (int i = 0; i < arr.length; i++) {
            int rem= n-arr[i];
            for (int j =1; j <arr.length; j++) {
                if (arr[j]== rem) {
                    System.out.println(arr[i]+" " +arr[j]);
                }
            }

        }*/


        //using hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();

        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;


        for (int i = 0; i < arr.length; i++) {
            int rem = n - arr[i];
            if (hm.containsKey(rem)) {

                System.out.println("the indexes are: " +hm.get(rem)+" "+i);
            }
            hm.put(arr[i], i);

        }
    }
}
