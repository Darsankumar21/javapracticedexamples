
class Employee{
    String name;
    String city;
    int id;
    int salary;


    public Employee(int id, String name, String city, int salary)
    {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public void getDetails()
    {
    System.out.println("Name: "+this.name+"Id: "+this.id+"City Name: "+this.city+"Salary: "+this.salary);
    }
}


public class Employeetest {
    public static void main(String[] args) {
        
    }
}
