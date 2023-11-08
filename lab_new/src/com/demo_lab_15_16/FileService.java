package com.demo_lab_15_16;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

public class FileService {

	public void ReadFile() {
		String fname="rwfile.txt";

		try (DataInputStream dis = new DataInputStream(new FileInputStream(fname));) {
			String line= dis.readLine();
			while(line != null) {
				System.out.println(line);
				line= dis.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void WriteFile() {
		String fname="rwfile.txt";
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fname));) {
			Scanner sc = new Scanner(System.in);
			String enter= sc.nextLine();
			//dos.writeChars(enter); //enter char+space
			
			byte[] data=enter.getBytes("UTF-8");
			dos.write(data);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
