package com.byteapp;
/*import java.io.*;
public class BugDetails {
	public static void main(String[] args) {
	try {

	FileOutputStream fs=new FileOutputStream("buginfo.dat");

	String str="Bug Info:";
	String devloperName="Peter,\n";
	String bugNo="Bug011,\n "; 
	String bugDesc="New Bug";
	byte[] bt=str.getBytes();
	byte[] str1=devloperName.getBytes();
	byte[] str2=bugNo.getBytes();
	byte[] str3=bugDesc.getBytes();

	fs.write(bt);
	fs.write(str1);
	fs.write(str2);
	fs.write(str3);

	fs.flush(); 
	fs.close();
	
            
            
        } catch(IOException e){
        	System.out.println("Io error"+e);
            
        }
    }
}*/
import java.io.*;

class BugDetails {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Enter developer name: ");
            String developerName = reader.readLine();
            
            System.out.print("Enter bug number: ");
            String bugNumber = reader.readLine();
            
            System.out.print("Enter bug description: ");
            String bugDescription = reader.readLine();
            
            String data = "Developer Name: " + developerName + "\nBug Number: " + bugNumber + "\nBug Description: " + bugDescription;
            
            FileOutputStream fos = new FileOutputStream("buginfo.dat");
            fos.write(data.getBytes());
            fos.close();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}