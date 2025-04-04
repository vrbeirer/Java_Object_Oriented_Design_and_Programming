public class static_variable {

static int a = 100; // static
int b = 200; // non static or  instance var

    public static void main(String[] args) {
        System.out.println("a value:-" + a);
        static_variable s = new static_variable();
        System.out.println("b value is:-"+ s.b);
    }


}
