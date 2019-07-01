package com.phoenix.demos;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialization {

	public static void main(String[] args)
	{
		ArraofOb acc[]=new ArraofOb[3];
				acc[0]=(new ArraofOb(1,"abc",1000));
				acc[1]=(new ArraofOb(1,"abc",1000));
				acc[2]=(new ArraofOb(1,"abc",1000));
	
				List<ArraofOb> accoutlist=new ArrayList<ArraofOb>();
				for(int i=0;i<acc.length;i++)
				{
					accoutlist.add(acc[i]);
					
				}
				System.out.println("serializable data");
				FileOutputStream fout;
				BufferedOutputStream bout;
				ObjectOutputStream oout;
				
				{
					fout=new FileOutputStream("textfile.txt");
					oout.writeObject(accoutlist);
					fout.close();
					oout.close();
					for(ArraofOb a:accoutlist)
					{
						System.out.println(a);
					}
				

				
	


