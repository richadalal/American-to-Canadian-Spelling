//Richa Dalal 
//American to Canadian Spelling

import java.util.Scanner;

public class CanadianSpelling
{ 
public static void main(String[] args)   

  { 
    Scanner sc= new Scanner(System.in);
  
    String word; 
    System.out.println("Type any word which you would like to see a change in spelling for");  
    word = sc.nextLine(); 
    String replaced = word.replace("or", "our"); 
    System.out.println("This is the new word with the Canadian spelling:"); 
   System.out.println(replaced); 
     
  }
}
