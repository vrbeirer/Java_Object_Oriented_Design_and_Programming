public class constructer {


static class Cat_details{
    Cat_details(String cat_name,String cat_breed,Integer cat_price){

        System.out.println("Cat name:-" + cat_name);
        System.out.println("Cat breed:-" + cat_breed);
        System.out.println("Cat price:-" + cat_price);

    }
 }

    public static void main(String[] args) {
        Cat_details obj = new Cat_details("pinkudo","egyptian",9999999);
    }




}
