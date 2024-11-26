package demoPkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling 
{
	public static void propdata() throws Exception
	{
		//File f = new File("./Data/data3.properties");
		
		FileReader fr = new FileReader("./Data/data3.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("prog"));
		System.out.println(prop.get("auto"));
		
	}
	
	public static void writedata() throws Exception
	{
		File f = new File("C:\\TestData\\data2.txt");
		
		FileWriter fw = new FileWriter(f,true);
		fw.write("\nThis is forth line in the file");
		fw.flush();
		fw.close();
		
	}
	
	public static void readdata() throws Exception
	{
		File f = new File("C:\\TestData\\data1.txt");
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();  //72
		
		
		while(r!=-1)  //72!=-1, -1!=-1
		{
			System.out.print((char)r); //Ha
			
			r = fr.read();
		}
		
		/*
		System.out.print((char)r);
		
		r = fr.read();
		System.out.print((char)r);
		
		r = fr.read();
		System.out.print((char)r);
		
		r = fr.read();
		System.out.print((char)r);
		
		r = fr.read();
		System.out.print((char)r);
		
		*/
		
	}
	
	public static void main(String[] args) throws Exception
	{
		propdata();
	}
	
}
