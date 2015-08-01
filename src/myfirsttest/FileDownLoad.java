package myfirsttest;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

class FileDownLoad {
	String inputName;
	String outputName;
	public FileDownLoad(String inputName, String outputName) throws IOException {
		this.inputName=inputName;
		this.outputName=outputName;
		// TODO Auto-generated constructor stub
		FileOutputStream fos=new FileOutputStream(outputName) ;
		URL url=new URL(inputName);
		URLConnection tc=url.openConnection();
		tc.connect();
		DataInputStream in=new DataInputStream(tc.getInputStream());
		int size=0;
		while((size=in.read())!=-1){
			fos.write(size);
		}
		fos.close();
		in.close();
	} 

}
