package Main;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

import CompressClass.RLE;
import FileManage.FileManager;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileManager fichier1 = new FileManager("text1.txt");
		System.out.println(fichier1.getByteSize_InitialContentFile());
		fichier1.setCompressContentFile(RLE.printRLE(fichier1.getInitialContentOfFile()));
		System.out.println(fichier1.getByteSize_CompressFile());
	}

}
