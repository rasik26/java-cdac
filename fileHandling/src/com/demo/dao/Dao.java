package com.demo.dao;

import com.demo.beans.Employee;

import java.io.FileNotFoundException;
import java.util.List;

public interface Dao {
    void readDataFromFile() throws FileNotFoundException;

    void save(Employee e);

    List<Employee> findAll();

    boolean removeById(int id);

    void writeToFile();
}
