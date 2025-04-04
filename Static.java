public class Static {

    static void method1(){

        System.out.println("This is static");

    }
    void method2(){

        System.out.println("This is non-static");
    }
    static int add(int a,int b){

        return a+b;

    }

    public static void main(String[] args) {
       method1();
       Static obj = new Static();
       obj.method2();
       System.out.println(add(20,30));
    }

}
