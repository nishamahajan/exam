package com.phoenix.demos;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fin=new FileInputStream("textfile");
			BufferedInputStream bin=new BufferedInputStream(fin);
			ObjectInputStream oin=new ObjectInputStream(bin);
			Account ref=(Account)oin.readObject();
			System.out.println(ref.accountName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
