abstract class Animal1{

    abstract void sound();
     void eat(){

         System.out.println("The animal is sleeping");
     }

}

class cat extends Animal1{

    void sound(){

        System.out.println("meow meow");

    }


}

public class Abstraction{

    public static void main(String[] args) {
         cat a = new cat();
        a.sound();
        a.eat();

    }


}