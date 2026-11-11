package main.java.lists.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int listSize = sc.nextInt();

        sc.nextLine();

        List<Employee> employees = new ArrayList<>(listSize);

        for(int i = 0; i < listSize; i++){
            System.out.println("Enter the employee name: ");
            String name = sc.nextLine();

            System.out.println("Enter the employee id: ");
            int id = sc.nextInt();

            System.out.println("Enter the employee salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            Employee employee = new Employee(name, id, salary);
            employees.add(employee);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int employeeId = sc.nextInt();


        List<Employee> increaseSalary = employees.stream().filter(employee -> employee.getId()==employeeId).toList();
        double percentage = 0;
        if (increaseSalary.isEmpty()){
            System.out.println("Employee id not found");
        }else{
            System.out.println("Enter the percentage: ");
            percentage = sc.nextDouble();
        }

        employees.removeIf(employee -> employee.getId() == employeeId);
        for (Employee employee : increaseSalary){
            employee.increaseSalary(percentage);
        }

        for (Employee employee : employees){
            System.out.println(employee);
        }
        for (Employee employee : increaseSalary){
            System.out.println(employee);
        }




    }
}
