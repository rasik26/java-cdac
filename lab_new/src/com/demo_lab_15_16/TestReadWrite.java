package com.demo_lab_15_16;

public class TestReadWrite {

	public static void main(String[] args) {
		FileService f= new FileService();
		f.ReadFile();
		System.out.println("Enter data to write");
		f.WriteFile();

	}

}
