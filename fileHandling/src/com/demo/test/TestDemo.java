package com.demo.test;

import com.demo.beans.Employee;
import com.demo.service.Service;
import com.demo.service.ServiceImpl;

import java.io.FileNotFoundException;
import java.security.Provider;
import java.util.List;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Service e= new ServiceImpl();
        e.ReadFromFile();
        Scanner sc = new Scanner(System.in);

        int choice =0;
        do{
            System.out.println("1.Add new Employee \n2.Delete employee \n3.display \n4.exit \n choice");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    e.addNewEmployee();
                    break;

                case 2:
                    System.out.println("enter id to be deleted");
                    int id = sc.nextInt();
                    boolean status = e.deleteById(id);
                    if(status)
                        System.out.println("deleted");
                    else
                        System.out.println("not found");

                    break;
                case 3:
                    List<Employee> elist= e.getAllEmployees();
                    elist.stream().forEach(System.out::println);
                    break;
                case 4 :
                    e.writeToFile();
                    sc.close();
                    System.out.println("thanks");
                default:
                    System.out.println("wrong choice");
            }

        }
        while (choice !=4);

    }
}
