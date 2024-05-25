class Employee
{
    String name;
    String city;
    int eid;
    float salary;
    public Employee(int eid, String name, String city, float salary)
    {
        this.eid = eid;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }
    public void getDetails()
    {
    System.out.println(this.name+this.eid+this.city+this.salary);
    }
}

public class employeedemo{
    public static void main(String[] args)
    {
        Employee e = new Employee(1, "Surya","Gnt", 100000);
        e.getDetails();
    }
}
