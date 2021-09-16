package iobufferstreams;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Copyfiledemo {

 
//copy file content and paste to another file (by creating new file automatically)
    
    public static void main(String ar[]) throws IOException {

 

        FileReader in = new FileReader("C:\\Users\\jyoti.gupta\\Desktop\\one.txt");
        FileWriter out = null;

 

        try {

 

        
            out = new FileWriter("C:\\Users\\jyoti.gupta\\Desktop\\two.txt");// output

 

            int c;
            while ((c = in.read())!=-1) {

 

                out.write(c);/// out put will generate on file instead of console

 

            }

 

            
            System.out.println("Done....");

 

        } catch (Exception e) {

 

            e.printStackTrace();
        }

 

        finally {

 

            in.close();
            out.close();
        }

 

    }

 

}