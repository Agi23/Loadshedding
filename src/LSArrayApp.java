package src;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class LSArrayApp {
    
    
    
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
    public static void ReadFile(){
    
        String line;
        String pathToFile = "LSData.txt";
        BufferedReader fin = null; 
        try
        {
            fin= new BufferedReader(new InputStreamReader(new FileInputStream(pathToFile)));
        do
        {
        line = fin.readLine();
        System.out.println(line);
        if(line==null)        //Checks if you reached end of file
            break;               //Exits the loop if end of file reached
        //TO DO CODE
        }
        while(line!=null);
            fin.close();             //Close the stream
        }
        catch(IOException e)
        {
        System.out.println(e.getMessage() +"\nProgram will be aborted");
        System.exit(0);
        }

        

    }
    
    /** 
     * @param args
     * @return 
     */
    public static void main(String[] args) {
        System.out.println("hello");
        ReadFile();
    } 
     
}