package com.demo.arrays;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A implements Serializable{
	int a;
    int b;
    transient int c; // Marking 'c' as transient so it won't be serialized


	public A(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}



	public static void main(String[] args) {
		A obj = new A(1, 2, 3);

        // Serialize the object to a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.ser"))) {
            out.writeObject(obj);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object from the file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.ser"))) {
            A deserializedObj = (A) in.readObject();
            System.out.println("Deserialized object: " + deserializedObj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

	}

}
