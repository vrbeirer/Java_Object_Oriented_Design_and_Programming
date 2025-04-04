public class modifier {

    public  int a = 100;// public
    public static int b =200; // public
    protected int c = 300; // protected
    private String name = "Abbasali";


    public static void main(String[] args) {

        modifier obj = new modifier();
        System.out.println("value of a is "+ obj.a);//we havent use static thats why we create object.
        System.out.println("value of b is "+b);// we use static thats why we haven't created the object.
        System.out.println("value of c is "+obj.c);// protected needs to be called with object.
        System.out.println("my name is "+obj.name);//private needs to be called with object.
    }




}
