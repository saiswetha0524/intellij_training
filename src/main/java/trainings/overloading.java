package trainings;

public class overloading {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println( add(2,2));
        System.out.println(add(2,3, 4));

        //ordinary comment

        System.out.println("hey");



    }
}
