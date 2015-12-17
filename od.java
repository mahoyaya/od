import java.io.*;
import java.util.*;


public class od {
    public static void main(String[] args){
	new od().method(args[0], args[1]);
    }

    public void method(String name, String b){
	File file = new File(name);
	try( FileInputStream fi = new FileInputStream(file);
	     DataInputStream di = new DataInputStream(fi)){
	    byte[] aryByte = new byte[Integer.parseInt(b)];
	    di.read(aryByte);
	    for(byte data: aryByte){
		System.out.print(String.format("%02x ", data));
	    }
	    System.out.println();
	} catch(Exception e){
	    e.printStackTrace();
	}
    }
}
