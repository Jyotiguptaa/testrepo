package iobufferstreams;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class BufferInputStreamdemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 FileInputStream bin = new FileInputStream("C:\\Users\\jyoti.gupta\\Desktop\\Collection14.txt");
	        BufferedInputStream b = new BufferedInputStream(bin);
	        
	        int i;
	        while((i=b.read())!=-1) {
	            
	            System.out.print((char)i);
	            
	        }
	        
	        bin.close();
	        b.close();
	        
	    }
	}

