interface  IAnimal{
    abstract void sound();
}
class Horse implements  IAnimal{
    public void sound(){
        System.out.println("Woof Woof");
    }
}
class Tiger implements  IAnimal{
    public void sound(){
        System.out.println("tu tu ");
    }
}
public class Interface {
    public static void main(String[] args) {
        Horse h = new Horse();
        Tiger t = new Tiger();
        t.sound();
        h.sound();
    }
}