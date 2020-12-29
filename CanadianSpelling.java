//Richa Dalal 

import hsa.Console; 
import java.awt.*; 
import java.util.*; 
import javax.imageio.*; 
import java.io.*; 
 
public class CanadianSpelling 
  
{
static Console c; 

 
  public static void main(String[] args) throws IOException  
  {
    c = new Console(); 
    
    String word; 
    c.println("Type any word which you would like to see a change in spelling for");  
    word = c.readLine(); 
   String replaced = word.replace("or", "our"); 
   c.println("This is the new word with the Canadian spelling:"); 
   c.println(replaced); 
     
  }
}
