package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import app.Banking;

public interface IOUtils 
{
	static void storeTransactionDetails(Map<Integer, Banking> BankMap, String fileName) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(BankMap);
		}
	}
	@SuppressWarnings("unchecked")
	static Map<Integer, Banking> restoreTransactionDetails(String fileName)
	{
		
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName)))
		{
			return (Map<Integer, Banking>) in.readObject();
		} catch (Exception e) {
			System.out.println("err in deserial "+e);
			return new HashMap<>();
		}
	}

}
