package test;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;

public class Principale {
	
	static void ecriredansLeflux(OutputStream outstr) throws IOException
	{
		for(int compt= 33;compt<127 ;compt++) {
			
			outstr. write(compt);
			if(compt%30 == 0) outstr. write('\n');
					
		}
		
		//operation sur outputStream
		//toByteArray -> reccupère un tableau de byte
	for(int compt = 33; compt <255; compt++)
	{
		byte[] arr = BigInteger.valueOf(compt).toByteArray();
	   if(arr.length > 1) 
	   {}
	   
	   outstr.write(arr);
	      
	}
	
	}
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream  fos = new FileOutputStream("exemple.dat");
		 
		ecriredansLeflux(fos);
		fos.close();
	}

}
