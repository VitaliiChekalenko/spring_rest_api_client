package com.badtwin.spring.rest;

import com.badtwin.spring.rest.configuration.MyConfig;
import com.badtwin.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        for (Employee e : allEmployees) {
//            System.out.println(e);
//        }

//        Employee empByID = communication.getEmployee(2);
//        System.out.println(empByID);

//        Employee employee = new Employee("Sveta", "Sokol", "HR", 1100);
//        employee.setId(14);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(14);
    }
}
