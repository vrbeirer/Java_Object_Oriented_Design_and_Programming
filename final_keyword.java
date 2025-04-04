// Final class - Cannot be inherited
final class FinalClass {
    void show() {
        System.out.println("This is a final class.");
    }
}

// Parent class demonstrating final method and variable
class Parent {
    final int MAX_VALUE = 100; // Final variable

    final void display() { // Final method
        System.out.println("This is a final method.");
    }
}

public class final_keyword {
    public static void main(String[] args) {
        FinalClass obj1 = new FinalClass();
        obj1.show();

        Parent obj2 = new Parent();
        System.out.println("Final variable: " + obj2.MAX_VALUE);
        obj2.display();
    }
}
