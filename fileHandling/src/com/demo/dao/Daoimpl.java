package com.demo.dao;

import com.demo.beans.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Daoimpl implements Dao{

    static List<Employee> elist;
    {
        elist = new ArrayList<>();

    }
    @Override
    public void readDataFromFile() {
        try(BufferedReader bis = new BufferedReader(new FileReader("empdata.txt"))) {
            String str = bis.readLine();
            while(str!= null){
                String[] strarr = str.split(",");
                Employee e = new Employee(Integer.parseInt(strarr[0]),strarr[1], strarr[2]);
                elist.add(e);
                str= bis.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("size =" + elist.size());
    }

    @Override
    public void save(Employee e) {
        elist.add(e);
    }

    @Override
    public List<Employee> findAll() {
        return elist;
    }

    @Override
    public boolean removeById(int id) {
        return elist.remove(new Employee(id, null, null));
    }

    @Override
    public void writeToFile() {
        try(BufferedWriter bos = new BufferedWriter(new FileWriter("empdata.txt"));) {
            for (Employee e:elist){
                System.out.println(e);
                bos.write(e.getId()+","+e.getName()+","+e.getMobile()+"\n");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
