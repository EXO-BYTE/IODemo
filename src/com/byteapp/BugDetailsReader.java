package com.byteapp;
import java.io.*;
public class BugDetailsReader {
	public static void main(String[] args) {
	try {

		FileInputStream fin=new FileInputStream("buginfo.dat");
		byte[] bt = new byte[100];

		fin.read(bt);

		for (byte b:bt) {
			System.out.print((char)b);
		}
	}
	catch(Exception e) {
	}
	}
}

