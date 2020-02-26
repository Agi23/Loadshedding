package src;
import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class LSArrayApp {
    
    /** 
     * @param args
     * @return 
     */
    public static void main(String[] args) {
        System.out.println("hello");
    } 
    
    /** 
     * @return 
     */
    public String PrintAreas(){
        return "specific area";
    }

    
    /** 
     * @return 
     */
    public String PrintAllAreas(){
        return "All";
    }

    
    /** 
     * Reads file
     */
    public void ReadFile(){
        Scanner fileIn =null;

        try{
            fileIn = new Scanner(new FileInputStream("LSData.txt"));
        }

        catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }

    }
    
    
     
}