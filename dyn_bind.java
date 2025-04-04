class animal {

    public void sound() {

        System.out.println("generic sound");


    }

}
    class Dog extends animal{

        public void sound(){

            System.out.println("beow beow");



        }


    }









public class dyn_bind {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();




    }


}
