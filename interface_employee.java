interface IEmployee {
    void displayDetails();
}

class Employee implements IEmployee {
    private int emp_id;
    private String emp_name;
    private double emp_salary;
    private String emp_loc;
    private String emp_phone;


    public Employee(int emp_id, String emp_name, double emp_salary, String emp_loc, String emp_phone) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
        this.emp_loc = emp_loc;
        this.emp_phone = emp_phone;
    }


    public void displayDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Salary: " + emp_salary);
        System.out.println("Employee Location: " + emp_loc);
        System.out.println("Employee Phone: " + emp_phone);
        System.out.println("------------------------------");
    }
}

public class interface_employee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Abbasali", 50000.0, "New York", "123-456-7890");
        Employee emp2 = new Employee(102, "Abhinav", 60000.0, "Los Angeles", "987-654-3210");

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
