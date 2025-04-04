class Poly{
    public void poly_method(){
        System.out.println("Parent");
    }
}

class Childpoly extends Poly{

    public  void poly_method(){
        System.out.println("this is Child");
    }
}



class Main1 {
    public static void main(String[] args) {
        Childpoly p = new Childpoly();
        p.poly_method();
    }
}