package com.demo.service;

import com.demo.beans.Employee;

import java.io.FileNotFoundException;
import java.util.List;

public interface Service {
    public void ReadFromFile() throws FileNotFoundException;

    public void addNewEmployee();

    List<Employee> getAllEmployees();
    boolean deleteById( int id);
    void writeToFile();

}
