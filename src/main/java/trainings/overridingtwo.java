package trainings;

class one{
    static int add(int a, int b){
        return a+b;
    }

}
class two extends one{
    static int add(int a, int b){
        return a+b;
    }
}

public class overridingtwo {
    public static void main(String[] args) {
        one o=new two();
        System.out.println(o.add(1,2));


    }
}
