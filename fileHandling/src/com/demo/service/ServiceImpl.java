package com.demo.service;

import com.demo.beans.Employee;
import com.demo.dao.Dao;
import com.demo.dao.Daoimpl;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class ServiceImpl implements Service {
    private Dao edao;
    public ServiceImpl(){
        edao = new Daoimpl();
    }

    @Override
    public void ReadFromFile() throws FileNotFoundException {
        edao.readDataFromFile();
    }

    @Override
    public void addNewEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id");
        int id=sc.nextInt();
        System.out.println("enter name");
        String name=sc.next();
        System.out.println("enter mob");
        String mobile= sc.next();
        Employee e = new Employee(id, name, mobile);
        edao.save(e);
    }

    public List<Employee> getAllEmployees(){
        return edao.findAll();
    }

    public boolean deleteById(int id){
        return edao.removeById(id);
    }
    public void writeToFile(){
        edao.writeToFile();
    }
}
