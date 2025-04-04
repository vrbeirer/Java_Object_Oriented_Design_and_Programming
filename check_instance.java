
class  Animal {}

class lynx extends Animal {}








public class check_instance {

    public static void main(String[] args) {
        lynx mylynx = new lynx();
        System.out.println(mylynx instanceof Animal); // true
    }


}
