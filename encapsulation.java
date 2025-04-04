public class encapsulation {

    private String name = "Abbasali";
    private int id ;

    public String getname(){

        return name;

    }

    public int getid() {
        return id ;
    }

    public void setid(int getid){

    this.id = getid;

    }




}



 class main{

    public static void main(String[] args) {
        encapsulation e = new encapsulation();
        System.out.println("name is:-"+e.getname());
        e.setid(102);
        System.out.println("id is :-"+e.getid());



    }



}
