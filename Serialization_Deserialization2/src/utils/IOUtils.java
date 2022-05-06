package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import app.Product;

public interface IOUtils 
{
	static void storeProductDetails(Map<Integer, Product> productMap, String fileName) throws IOException {
		// create chain of i/o strms
		// Java App ---> OOS (serialization) ---> FOS (bin file)
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			// API of OOS : public void writeObject(Object o) throws IOExc
			out.writeObject(productMap);// object --> bin stream
		}
	}
	// add a static method to return empty Map , in case of data file not found OR
	// ret populated map to the caller.
	@SuppressWarnings("unchecked")
	static Map<Integer, Product> restoreProductDetails(String fileName)
	{
		//create chain of strms for de-serial
		//Java App <--- OIS (de-serial) <----FIS (bin file)
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName)))
		{
			return (Map<Integer, Product>) in.readObject();
		} catch (Exception e) {
			System.out.println("err in deserial "+e);
			return new HashMap<>();
		}
	}

}
