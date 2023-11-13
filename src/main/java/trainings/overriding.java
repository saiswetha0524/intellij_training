package trainings;
class Animal{
    void eat(){

        System.out.println("animal eats");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("dog eats bone");
    }
}
public class overriding {

    public static void main(String[] args) {

        Animal ani=new Dog();
        ani.eat();

    }
}
