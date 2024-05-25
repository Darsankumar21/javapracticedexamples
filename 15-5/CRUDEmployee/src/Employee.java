import java.util.*;

public class Employee {
    int id;
    String name, address,desig;
    float salary;
    Date doj;
    public Employee(int id, String name, String address, String desig, float salary)
    {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.doj = doj;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Employee() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDesig() {
        return desig;
    }
    public void setDesig(String desig) {
        this.desig = desig;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public Date getDoj() {
        return doj;
    }
    public void setDoj(Date doj) {
        this.doj = doj;
    }
    
}
