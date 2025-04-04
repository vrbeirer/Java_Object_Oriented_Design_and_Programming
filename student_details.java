import java.util.Scanner;

public class student_details {
    public static void main(String args[]){

        int Id;
        float Cgpa;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter ID:");
        Id = sc.nextInt();
        System.out.println("Enter CGPA");
        Cgpa=sc.nextFloat();
        System.out.println("name:"+ name +"\n"+"ID:"+Id+"\n"+"CPA"+Cgpa);



    }
}
