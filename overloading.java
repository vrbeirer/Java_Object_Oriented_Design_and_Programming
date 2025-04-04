public class overloading {

    int S1trfruits(){

        System.out.println("Addition with overlaoding");
        return 0;
    }
    String fruits (String fruit_name){

            return fruit_name;

    }
    String fruits(String fruit_name,int fruit_price){

            return fruit_name+fruit_price;
    }


    public static void main(String[] args) {
     overloading obj = new overloading();
        obj.S1trfruits();
        System.out.println(obj.fruits("apple"));
        System.out.println(obj.fruits("apple",5000));
    }







}
