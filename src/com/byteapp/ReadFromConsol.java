package com.byteapp;
import java.io.*;
public class ReadFromConsol {
	public static void main(String [] arge) {
		
		InputStream in=System.in;
		try {
			byte[] bt=new byte[20];
			in.read(bt);
			String str=new String(bt);
			System.out.println("You have written"+str);
			
		}
		catch(IOException e)
		{System.out.println(e);
		}
		}
	}


