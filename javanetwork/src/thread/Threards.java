package thread;

import java.io.File;
import java.io.FilenameFilter;

public class Threards {
	
	
	public static void main(String[] args)
	{
		//calcul sha on sevral files
		
		 //load files within the current repository
		File dir = new File(".");
		File[] arr = dir.listFiles(new FilenameFilter() {
			
		@Override
		public boolean accept(File f, String name) {
				// TODO Auto-generated method stub
				
		if(name.endsWith(".java")) 
				return true;
				else
				return false;
			}
		});
		
		
		for (File f: arr) {
			
			//create Thread object(type of object->Thread)
			DigestThread digesth = new DigestThread(f);
			
			Thread  theard = new Thread(digesth);
			
			theard.start();
		}
		
		
		
		
	}
	

}
