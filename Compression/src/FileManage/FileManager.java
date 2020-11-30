package FileManage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

	File fileToCompress;
	String pathToFolder;
	String InitialContentOfFile="";

	public FileManager(String fileName) throws FileNotFoundException {
		super();
		File tamp = new File("");
		this.fileToCompress = new File(tamp.getAbsolutePath()+"\\src\\fichier\\"+fileName);
		pathToFolder = tamp.getAbsolutePath()+"\\src\\fichier\\";
		readDocument();
	}
	
	private void readDocument() throws FileNotFoundException {
		 Scanner myReader = new Scanner(fileToCompress);
	      while (myReader.hasNextLine()) {
	    	  InitialContentOfFile += myReader.nextLine()+"\n";
	      }
	      myReader.close();
	      System.out.println(InitialContentOfFile);
	}
		
	
	

	public String getInitialContentOfFile() {
		return InitialContentOfFile;
	}
	public long getByteSize_CompressFile() throws IOException {
		 FileWriter myWriter = new FileWriter(pathToFolder+"result.txt");
	      myWriter.write(InitialContentOfFile);
	      myWriter.close();
	      
	      File result = new File(pathToFolder+"result.txt");
	      return result.length();
	}
	
	
	
	
	
	
	
}
