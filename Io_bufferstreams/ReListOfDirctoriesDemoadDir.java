package iobufferstreams;
import java.io.File;
public class ReListOfDirctoriesDemoadDir {
///Write a Java program to get a list of all file/directory names from the given. 
   public static void main(String[] args) {
      File file = null;
      String[] paths;
  
      try {      
         // create new file object
         file = new File("D:\\Assignment");

 

         // array of files and directory
         paths = file.list();

 

         // for each name in the path array
         for(String path:paths) {
            // prints filename and directory name
            System.out.println(path);
         }
      } catch (Exception e) {
         // if any error occurs
         e.printStackTrace();
      }
   }
}