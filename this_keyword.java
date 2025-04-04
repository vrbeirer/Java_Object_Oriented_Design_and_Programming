class flower{

    private String flower_name;
    private String flower_colour;


    flower( String flower_name,String flower_colour){

        this.flower_name = flower_name;
        this.flower_colour = flower_colour;

    }



    public void flower_method(){

        System.out.println("flower name is :-"+flower_name);
        System.out.println("flower colour is :-"+flower_colour);


    }


}




public class this_keyword {

    public static void main(String[] args) {
        flower f = new flower("jasmine","white");
        f.flower_method();

    }


}
