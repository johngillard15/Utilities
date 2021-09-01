package com.utilities;

import java.io.*;

public class FileHandling {

    public static void write(Object obj){
        try{
            FileOutputStream data = new FileOutputStream("object.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(data);

            writeStream.writeObject(obj);
            writeStream.flush();
            writeStream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object read(){
        Object obj = null;

        try{
            FileInputStream data = new FileInputStream("object.txt");
            ObjectInputStream readStream = new ObjectInputStream(data);

            obj = readStream.readObject();
            readStream.close();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
