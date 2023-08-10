package com.byteapp;
import java.io.*;
public class WriteToConsol {
	public static void main(String[] args) {
		try {
			PrintStream pout=System.out;
			pout.write("Hello World".getBytes());
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
