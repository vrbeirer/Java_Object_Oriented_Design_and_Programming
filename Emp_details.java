class emp{

    private int id = 3021;
    private String name = "Abbasali";
    private int salary = 99898990;
    private String add = "Abc street";
    private String phone = "8089786547";


    public String getDetails() {
        return "ID: " + id + "\nName: " + name + "\nSalary: " + salary +
                "\nAddress: " + add + "\nPhone: " + phone;
    }





}



public class Emp_details {

    public static void main(String[] args) {

        emp employee = new emp();
        System.out.println(employee.getDetails());


    }




}
