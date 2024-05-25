// import java.util.*;

// public class Test1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int n;

//         // Employee e = new Employee(1,"Surya", "Gnt", 100000);
//         // Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of employees: ");
//         int n = sc.nextInt();


//         List employees = new ArrayList();

//         // Collect employee details
//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter details for employee " + (i + 1) + ":");

//             System.out.print("Enter ID: ");
//             int id = sc.nextInt();

//             System.out.print("Enter name: ");
//             String name = sc.next();

//             System.out.print("Enter city: ");
//             String city = sc.next();

//             System.out.print("Enter salary: ");
//             int salary = sc.nextInt();

//             Employee e = new Employee(id, name, city, salary);
//             employees.add(e);
//         }

//         System.out.println("\nEmployee Details:");
//         Object[] objarr=employees.toArray();
//         for (Object obj : objarr) {
//             Employee e = (Employee) obj;  // Print each employee's details
//             System.out.println(e.getDetails());
//         }
//         Iterator itr = employees.iterator();
//         while (itr.hasNext())
//         {
//             Employee ee =(Employee) itr.next();
//             System.out.println(ee.getDetails());
//         }
//     }
// }
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// Employee class to hold employee details
class Employee {
    String name;
    String city;
    int id;
    int salary;

    // Constructor to initialize an Employee
    public Employee(int id, String name, String city, int salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    // Method to return formatted employee details
    public String getDetails() {
        return "ID: " + this.id + ", Name: " + this.name + ", City: " + this.city + ", Salary: " + this.salary;
    }
}

// Main class to collect and display employee details
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        // Create a list with generics to store Employee objects
        List<Employee> employees = new ArrayList<>();

        // Collect employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter city: ");
            String city = sc.next();

            System.out.print("Enter salary: ");
            int salary = sc.nextInt();

            Employee e = new Employee(id, name, city, salary);
            employees.add(e); // Add Employee object to the list
        }

        System.out.println("\nEmployee Details:");

        // Using Object array and casting to Employee
        Object[] objarr = employees.toArray();
        for (Object obj : objarr) {
            Employee e = (Employee) obj;  // Cast Object to Employee
            System.out.println(e.getDetails()); // Print each employee's details
        }

        // Using Iterator to traverse the list
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()) {
            Employee ee = itr.next(); // No need to cast with generics
            System.out.println(ee.getDetails());
        }

        sc.close(); // Always close the Scanner to avoid resource leaks
    }
}
