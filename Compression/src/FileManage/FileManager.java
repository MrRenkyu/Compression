package FileManage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {

	File fileToCompress;
	String contentOfFile;

	public FileManager(String path) throws FileNotFoundException {
		super();
		this.fileToCompress = new File(path);
		readDocument();
	}
	
	private void readDocument() throws FileNotFoundException {
		 Scanner myReader = new Scanner(fileToCompress);
	      while (myReader.hasNextLine()) {
	        contentOfFile += myReader.nextLine()+"\n";
	      }
	      myReader.close();
	      System.out.println(contentOfFile);
	}
	
	
}
