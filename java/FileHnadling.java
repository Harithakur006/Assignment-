package java4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.Writer;
import java.rmi.AccessException;

public class FileHnadling {

	public static void main(String[] args) throws I0Exception {
		// TODO Auto-generated method stub
 File f1 = new File("D:\\New folder\\Test.txt");
 //create a new file in folder process
 Filewriter fw = new Filewriter (f1);
////this for the bridge created 
 
 BufferedWriter wr= new BufferedWriter(fw);
 //this for writing inside the folder
 
 wr.append("third line");
 
 wr.close();// close the bridge after writing
 
	}

}
