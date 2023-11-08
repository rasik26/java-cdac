package com.demo.test;

import java.io.*;

public class TestBufferedInputStream {
    BufferedOutputStream bos = null;
    String fname = "testcopy.txt";
        File f = new File(fname);
        try{
        if (f.exists()) {
            bos = new BufferedOutputStream(new FileOutputStream(f, true));
        } else {
            bos = new BufferedOutputStream(new FileOutputStream(f));
        }
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
    try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
                            BufferedOutputStream bos1= bos;){
        int x = bis.read();
        while (x!=1){
            bos.write(x);
            x= bis.read();
        }
    }catch(FileNotFoundException e){
        e.printStackTrace();
    }catch(IOException e){
        e.printStackTrace();
    }

}
