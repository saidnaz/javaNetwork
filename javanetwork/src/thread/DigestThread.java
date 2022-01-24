package thread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


//Implements Runnable interface(FonctionalInterface: java.lang)
//Inherited Thread
public class DigestThread implements Runnable{
	
	private File input;

	//constructor
	public DigestThread(File input) {
		super();
		this.input = input;
	}


	public void run() {
		
		
	FileInputStream finpStream = null;
	try {
		finpStream = new FileInputStream(input);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	//MessageDigest is a filter
	try {
		MessageDigest MDigest = MessageDigest.getInstance("SHA");
		DigestInputStream DigInpSTream  = new DigestInputStream(finpStream, MDigest);
	
	int  c;
	while(DigInpSTream.read() != -1) {
		c = DigInpSTream.read();
	}
	DigInpSTream.close();
	byte[] arr  = MDigest.digest();
	StringBuffer result = new StringBuffer(input.getName());
		for (byte b :arr)
		{
			result = result.append(b);
		}
		System.out.println(result.toString());
	} catch (NoSuchAlgorithmException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	}
}
