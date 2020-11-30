package FileManage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

	File fileToCompress;
	String pathToFolder;
	String initialContentFile="";
	String compressContentFile="";

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
	    	  initialContentFile += myReader.nextLine()+"\n";
	      }
	      myReader.close();
	      System.out.println(initialContentFile);
	}
		
	public long getByteSize_CompressFile() throws IOException {
		 FileWriter myWriter = new FileWriter(pathToFolder+"result.txt");
		 if(compressContentFile == "" || compressContentFile ==null) {
			 System.out.println("compressContentFile is null, please set value before call this method.");
			 myWriter.close();
			 return 0;
		 }
	      myWriter.write(compressContentFile);
	      myWriter.close();
	      
	      File result = new File(pathToFolder+"result.txt");
	      return result.length();
	}
	
	public long getByteSize_InitialContentFile() throws IOException {
	      return fileToCompress.length();
	}
	

	
	public String getInitialContentOfFile() {
		return initialContentFile;
	}

	public String getCompressContentFile() {
		return compressContentFile;
	}

	public void setCompressContentFile(String compressContentFile) {
		this.compressContentFile = compressContentFile;
	}
	
	

	
	
	
	
	
	
	
}
